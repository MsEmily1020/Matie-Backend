package com.ost.matie.domain.email;

import com.ost.matie.domain.email.dto.EmailCodeRequest;
import com.ost.matie.domain.email.dto.EmailRequest;
import com.ost.matie.domain.email.service.FindEmailService;
import com.ost.matie.domain.email.service.PostEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/email")
public class EmailController {
    private final PostEmailService postEmailService;
    private final FindEmailService findEmailService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String sendEmail(@RequestBody EmailRequest request) {
        return postEmailService.execute(request.getEmail());
    }

    @GetMapping
    public void getEmail(@RequestBody EmailCodeRequest request) {
        findEmailService.execute(request.getEmail(), request.getCode());
    }
}
