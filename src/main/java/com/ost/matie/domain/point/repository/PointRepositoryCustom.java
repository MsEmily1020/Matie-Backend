package com.ost.matie.domain.point.repository;

import com.ost.matie.domain.point.Point;

public interface PointRepositoryCustom {
    Point findFirstByUserIdOrderByCreatedDateDesc(Long userId);
}
