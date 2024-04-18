package com.ost.matie.domain.comment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUpvote is a Querydsl query type for Upvote
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUpvote extends EntityPathBase<Upvote> {

    private static final long serialVersionUID = -1078957887L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUpvote upvote = new QUpvote("upvote");

    public final QComment comment;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.ost.matie.domain.user.QUser user;

    public QUpvote(String variable) {
        this(Upvote.class, forVariable(variable), INITS);
    }

    public QUpvote(Path<? extends Upvote> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUpvote(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUpvote(PathMetadata metadata, PathInits inits) {
        this(Upvote.class, metadata, inits);
    }

    public QUpvote(Class<? extends Upvote> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.comment = inits.isInitialized("comment") ? new QComment(forProperty("comment"), inits.get("comment")) : null;
        this.user = inits.isInitialized("user") ? new com.ost.matie.domain.user.QUser(forProperty("user")) : null;
    }

}
