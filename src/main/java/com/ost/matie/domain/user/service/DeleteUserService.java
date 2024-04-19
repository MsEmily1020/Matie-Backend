package com.ost.matie.domain.user.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class DeleteUserService {
    private final UserRepository userRepository;

    public void execute(Long id) {
        if(!userRepository.existsById(id)) throw UserNotFoundException.EXCEPTION;
        userRepository.deleteById(id);
    }
}
