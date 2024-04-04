package com.ost.matie.dto.community;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateCommunityRequest {
    @NotEmpty(message = "제목 칸이 비어있습니다.")
    private String title;

    @NotEmpty(message = "설명 칸이 비어있습니다.")
    private String description;

    private Long agree;
    private Long disagree;
}
