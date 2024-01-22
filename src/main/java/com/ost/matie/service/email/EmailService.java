package com.ost.matie.service.email;

import com.ost.matie.config.RedisUtil;
import com.ost.matie.dto.email.AddEmailRequest;
import com.ost.matie.exception.ExpirationException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;

@RequiredArgsConstructor
@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;
    private final RedisUtil redisUtil;
    private String authKey;

    public void sendMessage(AddEmailRequest request) {
        authKey = createCode();

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("peace10200khs@gmail.com");
        message.setTo(request.getEmailAddress());
        message.setSubject("[Matie] 사용자 인증 이메일 코드");
        message.setText(authKey);
        javaMailSender.send(message);

        redisUtil.setDataExpire(authKey, request.getEmailAddress(), 60 * 1L);
    }

    public String getCode(String code) {
        if(redisUtil.getData(code) == null) throw new ExpirationException("유효한 코드를 찾을 수 없습니다.");
        return redisUtil.getData(code);
    }

    private String createCode() {
        return String.valueOf(new Random().nextInt(888888) + 111111);
    }
}
