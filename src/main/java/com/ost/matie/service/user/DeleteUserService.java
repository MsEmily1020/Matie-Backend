package com.ost.matie.service.user;

import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DeleteUserService {
    private final UserRepository userRepository;

    @Transactional
    public void execute(Long id) {
        if(!userRepository.existsById(id)) throw UserNotFoundException.EXCEPTION;
        userRepository.deleteById(id);
    }
}
