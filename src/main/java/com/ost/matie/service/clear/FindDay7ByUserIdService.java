package com.ost.matie.service.clear;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.dto.clear.ClearResponse;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.clear.ClearRepository;
import com.ost.matie.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@TransactionalService
@RequiredArgsConstructor
public class FindDay7ByUserIdService {
    private final ClearRepository clearRepository;
    private final UserRepository userRepository;

    public List<ClearResponse> execute(Long userId) {
        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;

        List<ClearResponse> clears = clearRepository.findByUserId(userId)
                .stream()
                .filter(clear -> clear.getDate().isAfter(LocalDate.now().minusDays(7)))
                .map(ClearResponse::new)
                .collect(Collectors.toList());

        return clears;
    }
}
