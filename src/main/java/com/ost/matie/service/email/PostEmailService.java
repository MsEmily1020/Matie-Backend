package com.ost.matie.service.email;

import com.ost.matie.config.RedisUtil;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;

@RequiredArgsConstructor
@Service
public class PostEmailService {
    private final JavaMailSender javaMailSender;
    private final RedisUtil redisUtil;
    private String authKey;

    @Transactional
    public String execute(String email) {
        authKey = createCode();

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("peace10200khs@gmail.com");
        message.setTo(email);
        message.setSubject("[Matie] 사용자 인증 이메일 코드");
        message.setText(authKey);
        javaMailSender.send(message);

        redisUtil.setDataExpire(email, authKey, 60 * 3L);

        return "성공적으로 보냈습니다.";
    }

    private String createCode() {
        return String.valueOf(new Random().nextInt(888888) + 111111);
    }
}
