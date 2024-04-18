package com.ost.matie.domain.clear;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClear is a Querydsl query type for Clear
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QClear extends EntityPathBase<Clear> {

    private static final long serialVersionUID = -827953089L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClear clear = new QClear("clear");

    public final com.ost.matie.domain.challenge.QChallenge challenge;

    public final DatePath<java.time.LocalDate> date = createDate("date", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.ost.matie.domain.user.QUser user;

    public QClear(String variable) {
        this(Clear.class, forVariable(variable), INITS);
    }

    public QClear(Path<? extends Clear> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QClear(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QClear(PathMetadata metadata, PathInits inits) {
        this(Clear.class, metadata, inits);
    }

    public QClear(Class<? extends Clear> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.challenge = inits.isInitialized("challenge") ? new com.ost.matie.domain.challenge.QChallenge(forProperty("challenge")) : null;
        this.user = inits.isInitialized("user") ? new com.ost.matie.domain.user.QUser(forProperty("user")) : null;
    }

}

