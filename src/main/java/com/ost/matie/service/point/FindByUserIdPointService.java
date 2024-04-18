package com.ost.matie.service.point;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.dto.point.PointResponse;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.point.PointRepository;
import com.ost.matie.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class FindByUserIdPointService {
    private final PointRepository pointRepository;
    private final UserRepository userRepository;

    public PointResponse execute(Long userId) {
        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;
        return new PointResponse(pointRepository.findFirstByUserIdOrderByCreatedDateDesc(userId));
    }
}
