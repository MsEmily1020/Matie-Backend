package com.ost.matie.service.comment.comment;

import com.ost.matie.annotation.ReadOnlyService;
import com.ost.matie.dto.comment.comment.CommentResponse;
import com.ost.matie.exception.CommunityNotFoundException;
import com.ost.matie.repository.comment.comment.CommentRepository;
import com.ost.matie.repository.community.CommunityRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ReadOnlyService
@RequiredArgsConstructor
public class FindAllByCommunityIdService {
    private final CommentRepository commentRepository;
    private final CommunityRepository communityRepository;

    public List<CommentResponse> execute (Long communityId) {
        if(!communityRepository.existsById(communityId)) throw CommunityNotFoundException.EXCEPTION;

        List<CommentResponse> comments = commentRepository.findAllByCommunityId(communityId)
                .stream()
                .map(CommentResponse::new)
                .toList();

        return comments;
    }
}
