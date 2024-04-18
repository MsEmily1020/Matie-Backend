package com.ost.matie.domain.challenge;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QChallenge is a Querydsl query type for Challenge
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChallenge extends EntityPathBase<Challenge> {

    private static final long serialVersionUID = 23109227L;

    public static final QChallenge challenge = new QChallenge("challenge");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> point = createNumber("point", Long.class);

    public final StringPath title = createString("title");

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public QChallenge(String variable) {
        super(Challenge.class, forVariable(variable));
    }

    public QChallenge(Path<? extends Challenge> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChallenge(PathMetadata metadata) {
        super(Challenge.class, metadata);
    }

}

