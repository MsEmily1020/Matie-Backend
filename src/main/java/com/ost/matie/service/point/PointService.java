package com.ost.matie.service.point;

import com.ost.matie.domain.point.Point;
import com.ost.matie.dto.point.AddPointRequest;
import com.ost.matie.exception.DataNotFoundException;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.PointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PointService {
    private final PointRepository pointRepository;

    public Point save(AddPointRequest request) {
        if(request.getVariation() == null) request.setVariation(0L);
        Point point = pointRepository.findFirstByUserIdOrderByCreatedDateDesc(request.getUser().getId());
        long balance = (point != null) ? point.getBalance() + request.getVariation() : 0;
        return pointRepository.save(request.toEntity(balance));
    }

    public Point findFirstByUserIdOrderByCreatedDateDesc(Long userId) {
        Point point = pointRepository.findFirstByUserIdOrderByCreatedDateDesc(userId);
        if(point == null) throw new UserNotFoundException("사용자를 찾을 수 없습니다. (id : " + userId + ")");
        return point;
    }
}
