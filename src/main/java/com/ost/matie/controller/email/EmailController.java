package com.ost.matie.controller.email;

import com.ost.matie.service.email.FindEmailService;
import com.ost.matie.service.email.PostEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/email")
public class EmailController {
    private final PostEmailService postEmailService;
    private final FindEmailService findEmailService;

    @PostMapping("/{email}")
    @ResponseStatus(HttpStatus.CREATED)
    public String sendEmail(@PathVariable String email) {
        return postEmailService.execute(email);
    }

    @GetMapping("/{email}/{code}")
    public String getEmail(@PathVariable String email, @PathVariable String code) {
        return findEmailService.execute(email, code);
    }
}
