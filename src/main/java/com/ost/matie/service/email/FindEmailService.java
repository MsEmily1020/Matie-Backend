package com.ost.matie.service.email;

import com.ost.matie.config.RedisUtil;
import com.ost.matie.exception.EmailCodeExpiredException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FindEmailService {
    private final RedisUtil redisUtil;

    @Transactional
    public String execute(String email, String code) {
        String codeFoundByEmail = redisUtil.getData(email);
        if(codeFoundByEmail == null || !codeFoundByEmail.equals(code)) throw EmailCodeExpiredException.EXCEPTION;
        return codeFoundByEmail;
    }
}
