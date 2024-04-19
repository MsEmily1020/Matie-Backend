package com.ost.matie.domain.favorite_product;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFavoriteProduct is a Querydsl query type for FavoriteProduct
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFavoriteProduct extends EntityPathBase<FavoriteProduct> {

    private static final long serialVersionUID = 1760502750L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFavoriteProduct favoriteProduct = new QFavoriteProduct("favoriteProduct");

    public final com.ost.matie.global.common.QBaseEntity _super = new com.ost.matie.global.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final com.ost.matie.domain.product.QProduct product;

    public final com.ost.matie.domain.user.QUser user;

    public QFavoriteProduct(String variable) {
        this(FavoriteProduct.class, forVariable(variable), INITS);
    }

    public QFavoriteProduct(Path<? extends FavoriteProduct> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFavoriteProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFavoriteProduct(PathMetadata metadata, PathInits inits) {
        this(FavoriteProduct.class, metadata, inits);
    }

    public QFavoriteProduct(Class<? extends FavoriteProduct> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new com.ost.matie.domain.product.QProduct(forProperty("product"), inits.get("product")) : null;
        this.user = inits.isInitialized("user") ? new com.ost.matie.domain.user.QUser(forProperty("user")) : null;
    }

}

