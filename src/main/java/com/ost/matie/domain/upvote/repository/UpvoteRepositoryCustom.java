package com.ost.matie.domain.upvote.repository;

import com.ost.matie.domain.upvote.Upvote;

import java.util.List;

public interface UpvoteRepositoryCustom {
    Long countAllByCommentId(Long commentId);

    List<Upvote> findAllByUserId(Long userId);
    Upvote findByUserIdAndCommentId(Long userId, Long commentId);

    Long deleteByUserIdAndCommentId(Long userId, Long commentId);
}
