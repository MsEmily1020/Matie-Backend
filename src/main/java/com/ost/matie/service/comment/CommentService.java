package com.ost.matie.service.comment;

import com.ost.matie.domain.comment.Comment;
import com.ost.matie.dto.comment.AddCommentRequest;
import com.ost.matie.dto.comment.UpdateCommentRequest;
import com.ost.matie.exception.DataNotFoundException;
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

    public void delete(Long id) {
        if(!commentRepository.existsById(id)) throw new DataNotFoundException("댓글의 정보를 찾을 수 없습니다. (id : " + id + ")");
        commentRepository.deleteById(id);
    }

    @Transactional
    public Comment update(Long id, UpdateCommentRequest request) {
        Comment comment = commentRepository.findById(id)
                .orElseThrow(() -> new DataNotFoundException("댓글의 정보를 찾을 수 없습니다. (id : " + id + ")"));

        comment.update(
                request.getDescription(),
                request.getUpvotes(),
                request.getUpvoteUserList()
        );

        return comment;
    }
}
