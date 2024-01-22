package com.ost.matie.service.service;

import com.ost.matie.dto.email.AddEmailRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMessage(AddEmailRequest request) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("peace10200khs@gmail.com");
        message.setTo(request.getEmailAddress());
        message.setSubject("[Matie] 사용자 인증 이메일 코드");
        message.setText(createCode() + "");
        javaMailSender.send(message);
    }

    public Integer createCode() {
        return (int)(Math.random() * 999999 + 1);
    }
}
