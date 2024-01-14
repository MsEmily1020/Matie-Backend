package com.ost.matie.controller.user;

import com.ost.matie.domain.user.Users;
import com.ost.matie.dto.user.AddUserRequest;
import com.ost.matie.dto.user.LoginUserRequest;
import com.ost.matie.dto.user.UpdateUserRequest;
import com.ost.matie.dto.user.UserResponse;
import com.ost.matie.service.user.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<Users> addUser(@Valid @RequestBody AddUserRequest request) {
        Users users = userService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(users);
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserResponse>> findAllUsers() {
        List<UserResponse> userResponses = userService.findAll()
                .stream()
                .map(UserResponse::new)
                .toList();

        return ResponseEntity.ok().body(userResponses);
    }

    @GetMapping("/login")
    public ResponseEntity<Users> findLoginUser(LoginUserRequest request) {
        Users users = userService.findByEmailAndPw(request);
        return ResponseEntity.ok().body(users);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<Users> updateUser(@PathVariable Long id,
                                            @Valid @RequestBody UpdateUserRequest request) {
        Users users = userService.update(id, request);
        return ResponseEntity.ok().body(users);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }
}
