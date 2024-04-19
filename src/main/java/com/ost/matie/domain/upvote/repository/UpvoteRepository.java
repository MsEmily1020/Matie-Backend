package com.ost.matie.domain.upvote.repository;

import com.ost.matie.domain.upvote.Upvote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpvoteRepository extends JpaRepository<Upvote, Long>, UpvoteRepositoryCustom {
    boolean existsByUserIdAndCommentId(Long userId, Long commentId);
}
