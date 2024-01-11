package com.ost.matie.service.point;

import com.ost.matie.domain.point.Point;
import com.ost.matie.dto.point.AddPointRequest;
import com.ost.matie.repository.PointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PointService {
    private final PointRepository pointRepository;

    public Point save(AddPointRequest request) {
        return pointRepository.save(request.toEntity());
    }

    public List<Point> findAll() { return pointRepository.findAll(); }
}
