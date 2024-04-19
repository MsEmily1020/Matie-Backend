package com.ost.matie.domain.point.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.point.dto.PointResponse;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.point.repository.PointRepository;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@ReadOnlyService
@RequiredArgsConstructor
public class FindByUserIdPointService {
    private final PointRepository pointRepository;
    private final UserRepository userRepository;

    public PointResponse execute(Long userId) {
        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;
        return new PointResponse(pointRepository.findFirstByUserIdOrderByCreatedDateDesc(userId));
    }
}
