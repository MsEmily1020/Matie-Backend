package com.ost.matie.dto.point;

import com.ost.matie.domain.point.Point;
import com.ost.matie.domain.user.Users;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddPointRequest {
    private Long variation;

    @NotNull(message = "user의 id를 넣어주세요.")
    private Users user;

    public Point toEntity(Long balances) {
        return Point.builder()
                .variation(variation)
                .balance(balances)
                .user(user)
                .build();
    }
}
