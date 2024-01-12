package com.ost.matie.service.comment;

import com.ost.matie.domain.comment.Comment;
import com.ost.matie.dto.comment.AddCommentRequest;
import com.ost.matie.dto.comment.UpdateCommentRequest;
import com.ost.matie.repository.CommentRepository;
import jakarta.transaction.Transactional;
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

    public void delete(Long id) { commentRepository.deleteById(id); }

    @Transactional
    public Comment update(Long id, UpdateCommentRequest request) {
        Comment comment = commentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found " + id));

        comment.update(
                request.getDescription(),
                request.getUpvotes(),
                request.getUpvoteUserList()
        );

        return comment;
    }
}
