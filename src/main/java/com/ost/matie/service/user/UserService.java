package com.ost.matie.service.user;

import com.ost.matie.domain.user.Users;
import com.ost.matie.dto.user.AddUserRequest;
import com.ost.matie.dto.user.LoginUserRequest;
import com.ost.matie.dto.user.UpdateUserRequest;
import com.ost.matie.exception.DuplicateException;
import com.ost.matie.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public Users save(AddUserRequest request) {
        if(userRepository.existsByUserIdOrEmail(request.getUserId(), request.getEmail()))
            throw new DuplicateException("duplicate date by userId : " + request.getUserId() + ", email : " + request.getEmail());

        return userRepository.save(request.toEntity());
    }

    public List<Users> findAll() { return userRepository.findAll(); }

    public Users findByUserIdAndPw(LoginUserRequest request) {
        return userRepository.findByUserIdAndPw(request.getUserId(), request.getPw());
    }

    public void delete(Long id) { userRepository.deleteById(id); }


    @Transactional
    public Users update(Long id, UpdateUserRequest request) {
        Users users = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found " + id));

        users.update(
                request.getName(),
                request.getPw(),
                request.getMascot()
        );

        return users;
    }
}
