package com.ost.matie.domain.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ost.matie.domain.user.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserResponse {
    private final Long id;
    private final String name;
    private final String userId;
    private final String email;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private final LocalDateTime createdDate;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.userId = user.getUserId();
        this.email = user.getEmail();
        this.createdDate = user.getCreatedDate();
    }
}
