package com.ost.matie.service.user;

import com.ost.matie.domain.user.User;
import com.ost.matie.dto.user.UpdateUserRequest;
import com.ost.matie.repository.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UpdateUserService {
    private final UserRepository userRepository;
    private final PasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public void execute(String email, UpdateUserRequest request) {
        User user = userRepository.findByEmail(email);
        user.update(bCryptPasswordEncoder.encode(request.getPw()));
    }
}
