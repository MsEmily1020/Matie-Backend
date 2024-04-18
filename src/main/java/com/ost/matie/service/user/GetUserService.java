package com.ost.matie.service.user;

import com.ost.matie.dto.user.UserResponse;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GetUserService {
    private final UserRepository userRepository;

    @Transactional
    public UserResponse execute(Long id) {
        return new UserResponse(userRepository.findById(id).orElseThrow(() -> UserNotFoundException.EXCEPTION));
    }
}
