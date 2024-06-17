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

    public final com.ost.matie.global.common.QBaseEntity _super = new com.ost.matie.global.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

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

