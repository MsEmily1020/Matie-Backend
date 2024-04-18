package com.ost.matie.controller.user;

import com.ost.matie.dto.user.AddUserRequest;
import com.ost.matie.dto.user.LoginUserRequest;
import com.ost.matie.dto.user.UpdateUserRequest;
import com.ost.matie.dto.user.UserResponse;
import com.ost.matie.service.user.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private final PostUserService postUserService;
    private final LoginUserService loginUserService;
    private final GetUserService getUserService;
    private final UpdateUserService updateUserService;
    private final DeleteUserService deleteUserService;

    @PostMapping
    public void addUser(@Valid @RequestBody AddUserRequest request) {
        postUserService.execute(request);
    }

    @PostMapping("/login")
    public void loginUser(@Valid @RequestBody LoginUserRequest request) {
        loginUserService.execute(request);
    }

    @GetMapping("/{id}")
    public UserResponse findByUser(@PathVariable Long id) {
        return getUserService.execute(id);
    }

    @GetMapping("/duplicate1/{email}")
    public void checkDuplicateEmail(@PathVariable String email) {
        postUserService.duplicateEmail(email);
    }

    @GetMapping("/duplicate2/{userId}")
    public void checkDuplicateUserId(@PathVariable String userId) {
        postUserService.duplicateUserId(userId);
    }

    @PutMapping("/{email}")
    public void updateUser(@PathVariable String email, @Valid @RequestBody UpdateUserRequest request) {
        updateUserService.execute(email, request);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        deleteUserService.execute(id);
    }
}
