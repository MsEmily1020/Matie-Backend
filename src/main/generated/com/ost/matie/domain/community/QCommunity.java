package com.ost.matie.domain.community;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCommunity is a Querydsl query type for Community
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCommunity extends EntityPathBase<Community> {

    private static final long serialVersionUID = -706226697L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCommunity community = new QCommunity("community");

    public final com.ost.matie.domain.QBaseTimeEntity _super = new com.ost.matie.domain.QBaseTimeEntity(this);

    public final NumberPath<Long> agree = createNumber("agree", Long.class);

    public final ListPath<com.ost.matie.domain.comment.Comment, com.ost.matie.domain.comment.QComment> commentList = this.<com.ost.matie.domain.comment.Comment, com.ost.matie.domain.comment.QComment>createList("commentList", com.ost.matie.domain.comment.Comment.class, com.ost.matie.domain.comment.QComment.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final com.ost.matie.domain.user.QUser creatorUser;

    public final StringPath description = createString("description");

    public final NumberPath<Long> disagree = createNumber("disagree", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath title = createString("title");

    public final StringPath type = createString("type");

    public QCommunity(String variable) {
        this(Community.class, forVariable(variable), INITS);
    }

    public QCommunity(Path<? extends Community> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCommunity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCommunity(PathMetadata metadata, PathInits inits) {
        this(Community.class, metadata, inits);
    }

    public QCommunity(Class<? extends Community> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.creatorUser = inits.isInitialized("creatorUser") ? new com.ost.matie.domain.user.QUser(forProperty("creatorUser")) : null;
    }

}

