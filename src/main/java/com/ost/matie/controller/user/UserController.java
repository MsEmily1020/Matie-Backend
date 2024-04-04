package com.ost.matie.controller.user;

import com.ost.matie.domain.user.User;
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

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<UserResponse> addUser(@Valid @RequestBody AddUserRequest request) {
        User user = userService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new UserResponse(user));
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponse> loginUser(@Valid @RequestBody LoginUserRequest request) {
        User user = userService.login(request);
        return ResponseEntity.ok().body(new UserResponse(user));
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserResponse> findByUser(@PathVariable Long id) {
        User user = userService.findById(id);
        return ResponseEntity.ok().body(new UserResponse(user));
    }

    @GetMapping("/users/duplicate1/{email}")
    public ResponseEntity<Void> checkDuplicateEmail(@PathVariable String email) {
        userService.duplicateEmail(email);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/duplicate2/{userId}")
    public ResponseEntity<Void> checkDuplicateUserId(@PathVariable String userId) {
        userService.duplicateUserId(userId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/users/{email}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable String email,
                                            @Valid @RequestBody UpdateUserRequest request) {
        User user = userService.update(email, request);
        return ResponseEntity.ok().body(new UserResponse(user));
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }
}
