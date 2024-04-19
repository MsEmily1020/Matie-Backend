package com.ost.matie.domain.user.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.user.dto.AddUserRequest;
import com.ost.matie.domain.email.exception.EmailDuplicateException;
import com.ost.matie.domain.user.exception.UserIdDuplicateException;
import com.ost.matie.domain.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@TransactionalService
@RequiredArgsConstructor
public class PostUserService {
    private final UserRepository userRepository;
    private final PasswordEncoder bCryptPasswordEncoder;

    public void execute(AddUserRequest request) {
        duplicateUserId(request.getUserId());
        duplicateEmail(request.getEmail());

        request.setPw(bCryptPasswordEncoder.encode(request.getPw()));

        userRepository.save(request.toEntity());
    }

    @Transactional
    public void duplicateEmail(String email) {
        if(userRepository.existsByEmail(email)) throw EmailDuplicateException.EXCEPTION;
    }

    @Transactional
    public void duplicateUserId(String userId) {
        if(userRepository.existsByUserId(userId)) throw UserIdDuplicateException.EXCEPTION;
    }
}
