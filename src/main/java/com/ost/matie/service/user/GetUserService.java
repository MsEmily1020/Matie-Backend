package com.ost.matie.service.user;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.dto.user.UserResponse;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class GetUserService {
    private final UserRepository userRepository;

    public UserResponse execute(Long id) {
        return new UserResponse(userRepository.findById(id).orElseThrow(() -> UserNotFoundException.EXCEPTION));
    }
}
