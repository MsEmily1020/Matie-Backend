package com.ost.matie.domain.point.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.point.Point;
import com.ost.matie.domain.point.dto.AddPointRequest;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.point.repository.PointRepository;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class PostPointService {
    private final PointRepository pointRepository;
    private final UserRepository userRepository;

    public void execute(AddPointRequest request) {
        if(!userRepository.existsById(request.getUser().getId())) throw UserNotFoundException.EXCEPTION;
        if(request.getVariation() == null) request.setVariation(0L);
        Point point = pointRepository.findFirstByUserIdOrderByCreatedDateDesc(request.getUser().getId());
        long balance = (point != null) ? point.getBalance() + request.getVariation() : 0;
        pointRepository.save(request.toEntity(balance));
    }
}
