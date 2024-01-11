package com.ost.matie.service.point;

import com.ost.matie.domain.point.Point;
import com.ost.matie.dto.point.AddPointRequest;
import com.ost.matie.repository.PointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PointService {
    private final PointRepository pointRepository;

    public Point save(AddPointRequest request) {
        Point point = pointRepository.findFirstByUserIdOrderByCreatedDateDesc(request.getUser().getId());
        long balance = (point != null) ? point.getBalance() + request.getVariation() : 0;
        return pointRepository.save(request.toEntity(balance));
    }

    public Point findFirstByUserIdOrderByCreatedDateDesc(Long userId) {
        return pointRepository.findFirstByUserIdOrderByCreatedDateDesc(userId);
    }
}
