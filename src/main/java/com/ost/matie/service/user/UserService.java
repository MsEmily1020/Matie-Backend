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
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder bCryptPasswordEncoder;

    public Users save(AddUserRequest request) {
        if(userRepository.existsByUserIdOrEmail(request.getUserId(), request.getEmail()))
            throw new DuplicateException("아이디 또는 이메일이 중복되었습니다.");

        request.setPw(bCryptPasswordEncoder.encode(request.getPw()));

        return userRepository.save(request.toEntity());
    }

    public Users findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("사용자를 찾을 수 없습니다. (id : " + id + ")"));
    }

    public Users login(LoginUserRequest request) {
        Users users = userRepository.findByUserId(request.getUserId());
        if(users == null || !bCryptPasswordEncoder.matches(request.getPw(), users.getPw())) throw new UserNotFoundException("아이디 또는 비밀번호를 확인해주세요.");
        return users;
    }

    public void delete(Long id) {
        if(!userRepository.existsById(id)) throw new UserNotFoundException("사용자를 찾을 수 없습니다. (id : " + id + ")");
        userRepository.deleteById(id);
    }


    @Transactional
    public Users update(Long id, UpdateUserRequest request) {
        Users users = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("사용자를 찾을 수 없습니다. (id : " + id + ")"));

        users.update(
                request.getName(),
                request.getPw()
        );

        return users;
    }
}
