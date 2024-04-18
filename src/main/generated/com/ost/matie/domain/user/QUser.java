package com.ost.matie.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -692409887L;

    public static final QUser user = new QUser("user");

    public final com.ost.matie.domain.QBaseTimeEntity _super = new com.ost.matie.domain.QBaseTimeEntity(this);

    public final ListPath<com.ost.matie.domain.cart.Cart, com.ost.matie.domain.cart.QCart> cartList = this.<com.ost.matie.domain.cart.Cart, com.ost.matie.domain.cart.QCart>createList("cartList", com.ost.matie.domain.cart.Cart.class, com.ost.matie.domain.cart.QCart.class, PathInits.DIRECT2);

    public final ListPath<com.ost.matie.domain.clear.Clear, com.ost.matie.domain.clear.QClear> clearList = this.<com.ost.matie.domain.clear.Clear, com.ost.matie.domain.clear.QClear>createList("clearList", com.ost.matie.domain.clear.Clear.class, com.ost.matie.domain.clear.QClear.class, PathInits.DIRECT2);

    public final ListPath<com.ost.matie.domain.comment.Comment, com.ost.matie.domain.comment.QComment> commentList = this.<com.ost.matie.domain.comment.Comment, com.ost.matie.domain.comment.QComment>createList("commentList", com.ost.matie.domain.comment.Comment.class, com.ost.matie.domain.comment.QComment.class, PathInits.DIRECT2);

    public final ListPath<com.ost.matie.domain.community.Community, com.ost.matie.domain.community.QCommunity> communityList = this.<com.ost.matie.domain.community.Community, com.ost.matie.domain.community.QCommunity>createList("communityList", com.ost.matie.domain.community.Community.class, com.ost.matie.domain.community.QCommunity.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath email = createString("email");

    public final ListPath<com.ost.matie.domain.favorite_product.FavoriteProduct, com.ost.matie.domain.favorite_product.QFavoriteProduct> favoriteProductList = this.<com.ost.matie.domain.favorite_product.FavoriteProduct, com.ost.matie.domain.favorite_product.QFavoriteProduct>createList("favoriteProductList", com.ost.matie.domain.favorite_product.FavoriteProduct.class, com.ost.matie.domain.favorite_product.QFavoriteProduct.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath name = createString("name");

    public final ListPath<com.ost.matie.domain.point.Point, com.ost.matie.domain.point.QPoint> pointList = this.<com.ost.matie.domain.point.Point, com.ost.matie.domain.point.QPoint>createList("pointList", com.ost.matie.domain.point.Point.class, com.ost.matie.domain.point.QPoint.class, PathInits.DIRECT2);

    public final StringPath pw = createString("pw");

    public final ListPath<com.ost.matie.domain.comment.Upvote, com.ost.matie.domain.comment.QUpvote> upvoteList = this.<com.ost.matie.domain.comment.Upvote, com.ost.matie.domain.comment.QUpvote>createList("upvoteList", com.ost.matie.domain.comment.Upvote.class, com.ost.matie.domain.comment.QUpvote.class, PathInits.DIRECT2);

    public final StringPath userId = createString("userId");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

