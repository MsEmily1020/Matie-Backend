package com.ost.matie.service.point;

import com.ost.matie.dto.point.PointResponse;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.point.PointRepository;
import com.ost.matie.repository.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FindByUserIdPointService {
    private final PointRepository pointRepository;
    private final UserRepository userRepository;

    @Transactional
    public PointResponse execute(Long userId) {
        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;
        return new PointResponse(pointRepository.findFirstByUserIdOrderByCreatedDateDesc(userId));
    }
}
