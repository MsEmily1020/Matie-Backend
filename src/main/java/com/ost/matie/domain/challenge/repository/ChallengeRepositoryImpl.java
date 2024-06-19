package com.ost.matie.domain.challenge.repository;

import com.ost.matie.domain.challenge.Challenge;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ost.matie.domain.challenge.QChallenge.challenge;

@Repository
@RequiredArgsConstructor
public class ChallengeRepositoryImpl implements ChallengeRepositoryCustom {
    private final JPAQueryFactory queryFactory;


    @Override
    public List<Challenge> findAllByType(Integer type) {
        return queryFactory
                .selectFrom(challenge)
                .where(challenge.type.eq(type))
                .fetch();
    }

    @Override
    public Page<Challenge> findAllByTypePagination(Integer type, Pageable pageable) {
        List<Challenge> challenges = queryFactory
                .selectFrom(challenge)
                .where(challenge.type.eq(type))
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        JPQLQuery<Challenge> count = queryFactory
                .selectFrom(challenge)
                .where(challenge.type.eq(type));

        return PageableExecutionUtils.getPage(challenges, pageable, count::fetchCount);
    }
}
