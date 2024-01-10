package com.ost.matie.controller.user;

import com.ost.matie.domain.user.Users;
import com.ost.matie.dto.user.AddUserRequest;
import com.ost.matie.service.user.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
