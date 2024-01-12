package com.ost.matie.dto.comment;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateCommentRequest {
    @NotEmpty
    private String description;

    @Min(0)
    private Long upvotes;

    private List<Long> upvoteUserList;
}
