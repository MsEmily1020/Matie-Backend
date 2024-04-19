package com.ost.matie.domain.comment.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.comment.dto.CommentResponse;
import com.ost.matie.domain.community.exception.CommunityNotFoundException;
import com.ost.matie.domain.comment.repository.CommentRepository;
import com.ost.matie.domain.community.repository.CommunityRepository;
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
