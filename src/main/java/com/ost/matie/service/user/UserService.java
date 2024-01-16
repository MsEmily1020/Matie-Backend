package com.ost.matie.service.user;

import com.ost.matie.domain.user.Users;
import com.ost.matie.dto.user.AddUserRequest;
import com.ost.matie.dto.user.LoginUserRequest;
import com.ost.matie.dto.user.UpdateUserRequest;
import com.ost.matie.exception.DuplicateException;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public Users save(AddUserRequest request) {
        if(!userRepository.existsByUserIdOrEmail(request.getUserId(), request.getEmail()))
            throw new DuplicateException("duplicate date by userId : " + request.getUserId() + ", email : " + request.getEmail());

        return userRepository.save(request.toEntity());
    }

    public Users findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("user not found by id : " + id));
    }

    public Users findByEmailAndPw(LoginUserRequest request) {
        Users users = userRepository.findByEmailAndPw(request.getEmail(), request.getPw());
        if(users == null) throw new UserNotFoundException("user not found by email : " + request.getEmail() + ", pw : " + request.getPw());
        return users;
    }

    public void delete(Long id) {
        if(!userRepository.existsById(id)) throw new UserNotFoundException("user not found by id : " + id);
        userRepository.deleteById(id);
    }


    @Transactional
    public Users update(Long id, UpdateUserRequest request) {
        Users users = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("user not found by id : " + id));

        users.update(
                request.getName(),
                request.getPw()
        );

        return users;
    }
}
