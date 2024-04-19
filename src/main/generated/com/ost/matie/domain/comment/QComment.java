package com.ost.matie.domain.comment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QComment is a Querydsl query type for Comment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QComment extends EntityPathBase<Comment> {

    private static final long serialVersionUID = 2079832355L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QComment comment = new QComment("comment");

    public final com.ost.matie.global.common.QBaseEntity _super = new com.ost.matie.global.common.QBaseEntity(this);

    public final com.ost.matie.domain.community.QCommunity community;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final ListPath<com.ost.matie.domain.upvote.Upvote, com.ost.matie.domain.upvote.QUpvote> upvoteList = this.<com.ost.matie.domain.upvote.Upvote, com.ost.matie.domain.upvote.QUpvote>createList("upvoteList", com.ost.matie.domain.upvote.Upvote.class, com.ost.matie.domain.upvote.QUpvote.class, PathInits.DIRECT2);

    public final com.ost.matie.domain.user.QUser user;

    public QComment(String variable) {
        this(Comment.class, forVariable(variable), INITS);
    }

    public QComment(Path<? extends Comment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QComment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QComment(PathMetadata metadata, PathInits inits) {
        this(Comment.class, metadata, inits);
    }

    public QComment(Class<? extends Comment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.community = inits.isInitialized("community") ? new com.ost.matie.domain.community.QCommunity(forProperty("community"), inits.get("community")) : null;
        this.user = inits.isInitialized("user") ? new com.ost.matie.domain.user.QUser(forProperty("user")) : null;
    }

}

