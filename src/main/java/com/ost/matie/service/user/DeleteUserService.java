package com.ost.matie.service.user;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.user.UserRepository;
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
