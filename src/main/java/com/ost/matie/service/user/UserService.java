package com.ost.matie.service.user;

import com.ost.matie.domain.user.Users;
import com.ost.matie.dto.user.AddUserRequest;
import com.ost.matie.dto.user.LoginUserRequest;
import com.ost.matie.dto.user.UpdateUserRequest;
import com.ost.matie.exception.DuplicateException;
import com.ost.matie.exception.NotFoundException;
import com.ost.matie.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder bCryptPasswordEncoder;

    public Users save(AddUserRequest request) {
        if(userRepository.existsByUserId(request.getUserId()))
            throw new DuplicateException("userId", "아이디가 중복되었습니다.");

        if(userRepository.existsByEmail(request.getEmail()))
            throw new DuplicateException("email", "이메일이 중복되었습니다.");

        request.setPw(bCryptPasswordEncoder.encode(request.getPw()));

        return userRepository.save(request.toEntity());
    }

    public Users findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException("사용자를 찾을 수 없습니다. (id : " + id + ")"));
    }

    public Users login(LoginUserRequest request) {
        Users users = userRepository.findByUserIdOrEmail(request.getUserId(), request.getUserId());
        if(users == null || !bCryptPasswordEncoder.matches(request.getPw(), users.getPw())) throw new NotFoundException("Check your email/id or password");
        return users;
    }

    public void delete(Long id) {
        if(!userRepository.existsById(id)) throw new NotFoundException("사용자를 찾을 수 없습니다. (id : " + id + ")");
        userRepository.deleteById(id);
    }


    @Transactional
    public Users update(Long id, UpdateUserRequest request) {
        Users users = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("사용자를 찾을 수 없습니다. (id : " + id + ")"));

        users.update(
                request.getName(),
                request.getPw()
        );

        return users;
    }
}
