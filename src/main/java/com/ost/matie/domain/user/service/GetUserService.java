package com.ost.matie.domain.user.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.user.dto.UserResponse;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@ReadOnlyService
@RequiredArgsConstructor
public class GetUserService {
    private final UserRepository userRepository;

    public UserResponse execute(Long id) {
        return new UserResponse(userRepository.findById(id).orElseThrow(() -> UserNotFoundException.EXCEPTION));
    }
}
