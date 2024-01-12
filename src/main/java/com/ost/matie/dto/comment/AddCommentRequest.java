package com.ost.matie.dto.comment;

import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.user.Users;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddCommentRequest {
    @NotEmpty
    private String description;

    @NotNull
    private Users user;

    @NotNull
    private Community community;
}
