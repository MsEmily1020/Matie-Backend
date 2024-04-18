package com.ost.matie.service.user;

import com.ost.matie.domain.user.User;
import com.ost.matie.dto.user.LoginUserRequest;
import com.ost.matie.exception.UserIncorrectException;
import com.ost.matie.repository.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LoginUserService {
    private final UserRepository userRepository;
    private final PasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public void execute(LoginUserRequest request) {
        User user = userRepository.findByUserIdOrEmail(request.getUserId(), request.getUserId());
        if(user == null || !bCryptPasswordEncoder.matches(request.getPw(), user.getPw())) throw UserIncorrectException.EXCEPTION;
    }
}
