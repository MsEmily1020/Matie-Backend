package com.ost.matie.repository;

import com.ost.matie.domain.point.Point;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PointRepository extends JpaRepository<Point, Long> {
    List<Point> findByUserIdOrderByCreatedDateDesc(Long userId);
}
