package com.ost.matie.domain.clear.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.clear.dto.ClearResponse;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.clear.repository.ClearRepository;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@ReadOnlyService
@RequiredArgsConstructor
public class FindByUserIdService {
    private final ClearRepository clearRepository;
    private final UserRepository userRepository;

    public List<ClearResponse> execute (Long userId) {
        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;

        List<ClearResponse> clears = clearRepository.findByUserId(userId)
                .stream()
                .map(ClearResponse::new)
                .collect(Collectors.toList());

        return clears;
    }
}
