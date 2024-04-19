package com.ost.matie.domain.email.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.global.config.RedisUtil;
import com.ost.matie.domain.email.exception.EmailCodeExpiredException;
import lombok.RequiredArgsConstructor;

@ReadOnlyService
@RequiredArgsConstructor
public class FindEmailService {
    private final RedisUtil redisUtil;

    public String execute(String email, String code) {
        String codeFoundByEmail = redisUtil.getData(email);
        if(codeFoundByEmail == null || !codeFoundByEmail.equals(code)) throw EmailCodeExpiredException.EXCEPTION;
        return codeFoundByEmail;
    }
}
