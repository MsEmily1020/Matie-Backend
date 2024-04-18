package com.ost.matie.service.user;

import com.ost.matie.dto.user.AddUserRequest;
import com.ost.matie.exception.EmailDuplicateException;
import com.ost.matie.exception.UserIdDuplicateException;
import com.ost.matie.repository.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostUserService {
    private final UserRepository userRepository;
    private final PasswordEncoder bCryptPasswordEncoder;

    @Transactional
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
