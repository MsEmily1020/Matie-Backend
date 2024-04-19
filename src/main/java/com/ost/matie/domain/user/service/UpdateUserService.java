package com.ost.matie.domain.user.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.user.User;
import com.ost.matie.domain.user.dto.UpdateUserRequest;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@TransactionalService
@RequiredArgsConstructor
public class UpdateUserService {
    private final UserRepository userRepository;
    private final PasswordEncoder bCryptPasswordEncoder;

    public void execute(String email, UpdateUserRequest request) {
        User user = userRepository.findByEmail(email);
        user.update(bCryptPasswordEncoder.encode(request.getPw()));
    }
}
