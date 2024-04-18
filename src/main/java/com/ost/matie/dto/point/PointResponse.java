package com.ost.matie.dto.point;

import com.ost.matie.domain.point.Point;
import com.ost.matie.domain.user.User;
import com.ost.matie.dto.user.UserResponse;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PointResponse {
    private final Long id;
    private final Long variation;
    private final Long balance;
    private final LocalDateTime createdDate;
    private final User user;

    public PointResponse(Point point) {
        this.id = point.getId();
        this.variation = point.getVariation();
        this.balance = point.getBalance();
        this.createdDate = point.getCreatedDate();
        this.user = point.getUser();
    }
}
