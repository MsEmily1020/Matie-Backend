package com.ost.matie.controller.email;

import com.ost.matie.service.email.FindEmailService;
import com.ost.matie.service.email.SendEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/email")
public class EmailController {
    private final SendEmailService sendEmailService;
    private final FindEmailService findEmailService;

    @PostMapping("/{email}")
    public String sendEmail(@PathVariable String email) {
        return sendEmailService.execute(email);
    }

    @GetMapping("/{email}/{code}")
    public String getEmail(@PathVariable String email, @PathVariable String code) {
        return findEmailService.execute(email, code);
    }
}
