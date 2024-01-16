package com.ost.matie.dto.comment;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateCommentRequest {
    @NotEmpty(message = "설명 칸이 비어있습니다.")
    private String description;

    @Min(value = 0, message = "0미만은 없습니다.")
    private Long upvotes;

    @NotNull(message = "user list를 넣어주세요.")
    private List<Long> upvoteUserList;
}
