
package com.ost.matie.global.exception.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_INCORRECT(HttpStatus.BAD_REQUEST, "Check your email/id or password"),
    EMAIL_CODE_EXPIRED(HttpStatus.BAD_REQUEST, "유효한 코드를 찾을 수 없습니다."),

    USER_DUPLICATE(HttpStatus.CONFLICT, "아이디 또는 이메일이 중복되었습니다."),
    EMAIL_DUPLICATE(HttpStatus.CONFLICT, "Email already exists, use another email address or login"),
    USERID_DUPLICATE(HttpStatus.CONFLICT, "ID already exists, use another ID"),
    USER_CLEAR_DUPLICATE(HttpStatus.CONFLICT, "이미 해당 유저의 클리어 여부가 존재합니다."),
    UPVOTE_DUPLICATE(HttpStatus.CONFLICT, "이미 좋아요를 클릭하셨습니다."),
    FAVORITE_PRODUCT_DUPLICATE(HttpStatus.CONFLICT, "이미 좋아요를 클릭하셨습니다."),
    CART_DUPLICATE(HttpStatus.CONFLICT, "이미 장바구니에 존재하는 제품입니다."),

    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다."),
    TYPE_NOT_FOUND(HttpStatus.NOT_FOUND, "type은 1, 2, 3, 4만 찾을 수 있습니다."),
    COMMUNITY_TYPE_NOT_FOUND(HttpStatus.NOT_FOUND, "type은 Q&A 또는 Debate만 가능합니다."),
    COMMUNITY_NOT_FOUND(HttpStatus.NOT_FOUND, "커뮤니티 정보를 찾을 수 없습니다."),
    COMMENT_NOT_FOUND(HttpStatus.NOT_FOUND, "댓글의 정보를 찾을 수 없습니다."),
    PRODUCT_NOT_FOUND(HttpStatus.NOT_FOUND, "상품의 정보를 찾을 수 없습니다."),
    CATEGORY_NOT_FOUND(HttpStatus.NOT_FOUND, "카테고리의 정보를 찾을 수 없습니다."),
    CHALLENGE_NOT_FOUND(HttpStatus.NOT_FOUND, "챌린지의 정보를 찾을 수 없습니다."),
    CART_NOT_FOUND(HttpStatus.NOT_FOUND, "장바구니의 정보를 찾을 수 없습니다."),
    UPVOTE_NOT_FOUND(HttpStatus.NOT_FOUND, "좋아요를 누른 정보를 찾을 수 없습니다."),
    FAVORITE_PRODUCT_NOT_FOUND(HttpStatus.NOT_FOUND, "좋아요를 누른 정보를 찾을 수 없습니다"),

    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error");

    private final HttpStatus status;
    private final String message;
}
