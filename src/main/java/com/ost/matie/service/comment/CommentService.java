package com.ost.matie.service.comment;

import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.community.Community;
import com.ost.matie.dto.comment.AddCommentRequest;
import com.ost.matie.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public Comment save(AddCommentRequest request) {
        return commentRepository.save(request.toEntity());
    }

    public List<Comment> findAllByCommunityId(Long communityId) {
        return commentRepository.findAllByCommunityId(communityId);
    }
}
