package com.ost.matie.dto.user;

import com.ost.matie.domain.image.Image;
import com.ost.matie.domain.user.Users;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserResponse {
    private final Long id;
    private final String name;
    private final String email;
    private final LocalDateTime createdDate;
    private final Image mascot;

    public UserResponse(Users users) {
        this.id = users.getId();
        this.name = users.getName();
        this.email = users.getEmail();
        this.createdDate = users.getCreatedDate();
        this.mascot = users.getMascot();
    }
}
