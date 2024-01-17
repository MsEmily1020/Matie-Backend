package com.ost.matie.controller.user;

import com.ost.matie.domain.user.Users;
import com.ost.matie.dto.point.AddPointRequest;
import com.ost.matie.dto.user.AddUserRequest;
import com.ost.matie.dto.user.LoginUserRequest;
import com.ost.matie.dto.user.UpdateUserRequest;
import com.ost.matie.dto.user.UserResponse;
import com.ost.matie.service.point.PointService;
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
    private final PointService pointService;

    @PostMapping("/users")
    public ResponseEntity<UserResponse> addUser(@Valid @RequestBody AddUserRequest request) {
        Users users = userService.save(request);
        pointService.save(new AddPointRequest(0L, users));
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new UserResponse(users));
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponse> loginUser(@Valid @RequestBody LoginUserRequest request) {
        Users users = userService.login(request);
        return ResponseEntity.ok().body(new UserResponse(users));
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserResponse> findByUser(@PathVariable Long id) {
        Users users = userService.findById(id);
        return ResponseEntity.ok().body(new UserResponse(users));
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable Long id,
                                            @Valid @RequestBody UpdateUserRequest request) {
        Users users = userService.update(id, request);
        return ResponseEntity.ok().body(new UserResponse(users));
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }
}
