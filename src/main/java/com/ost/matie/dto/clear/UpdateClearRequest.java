package com.ost.matie.dto.clear;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateClearRequest {
    private List<Long> challenge;
}
