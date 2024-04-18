package com.ost.matie.service.email;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.config.RedisUtil;
import com.ost.matie.exception.EmailCodeExpiredException;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class FindEmailService {
    private final RedisUtil redisUtil;

    public String execute(String email, String code) {
        String codeFoundByEmail = redisUtil.getData(email);
        if(codeFoundByEmail == null || !codeFoundByEmail.equals(code)) throw EmailCodeExpiredException.EXCEPTION;
        return codeFoundByEmail;
    }
}
