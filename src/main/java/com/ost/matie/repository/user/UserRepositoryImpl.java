package com.ost.matie.repository.user;

import com.ost.matie.domain.user.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.ost.matie.domain.user.QUser.user;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Override
    public User findByUserIdOrEmail(String userId, String email) {
        return queryFactory
                .selectFrom(user)
                .where(user.userId.eq(userId).or(user.email.eq(email)))
                .fetchOne();
    }

    @Override
    public User findByEmail(String email) {
        return queryFactory
                .selectFrom(user)
                .where(user.email.eq(email))
                .fetchOne();
    }
}
