package com.ost.matie.controller.email;

import com.ost.matie.dto.email.AddEmailRequest;
import com.ost.matie.service.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class EmailController {
    private final EmailService emailService;

    @PostMapping("/email")
    public ResponseEntity<String> sendEmail(@RequestBody AddEmailRequest request) {
        emailService.sendMessage(request);
        return ResponseEntity.ok().body("성공적으로 보냈습니다.");
    }
}
