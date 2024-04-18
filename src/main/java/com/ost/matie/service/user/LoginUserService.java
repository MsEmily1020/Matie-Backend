package com.ost.matie.service.user;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.domain.user.User;
import com.ost.matie.dto.user.LoginUserRequest;
import com.ost.matie.dto.user.UserResponse;
import com.ost.matie.exception.UserIncorrectException;
import com.ost.matie.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@TransactionalService
@RequiredArgsConstructor
public class LoginUserService {
    private final UserRepository userRepository;
    private final PasswordEncoder bCryptPasswordEncoder;

    public UserResponse execute(LoginUserRequest request) {
        User user = userRepository.findByUserIdOrEmail(request.getUserId(), request.getUserId());
        if(user == null || !bCryptPasswordEncoder.matches(request.getPw(), user.getPw())) throw UserIncorrectException.EXCEPTION;
        return new UserResponse(user);
    }
}
