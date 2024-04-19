package com.ost.matie.domain.comment.repository;

import com.ost.matie.domain.comment.Comment;

import java.util.List;

public interface CommentRepositoryCustom {
    List<Comment> findAllByCommunityId(Long communityId);
}
