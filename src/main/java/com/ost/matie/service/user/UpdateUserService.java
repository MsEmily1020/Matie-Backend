package com.ost.matie.service.user;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.domain.user.User;
import com.ost.matie.dto.user.UpdateUserRequest;
import com.ost.matie.repository.user.UserRepository;
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
