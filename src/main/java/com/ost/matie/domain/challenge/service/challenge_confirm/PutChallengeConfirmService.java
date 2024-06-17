package com.ost.matie.domain.challenge.service.challenge_confirm;

import com.ost.matie.domain.challenge.ChallengeConfirm;
import com.ost.matie.domain.challenge.dto.ChallengeConfirmResponse;
import com.ost.matie.domain.challenge.dto.UpdateChallengeConfirmRequest;
import com.ost.matie.domain.challenge.exception.ChallengeNotFoundException;
import com.ost.matie.domain.challenge.repository.ChallengeConfirmRepository;
import com.ost.matie.domain.challenge.repository.ChallengeRepository;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.user.repository.UserRepository;
import com.ost.matie.global.annotation.TransactionalService;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class PutChallengeConfirmService {
    private final ChallengeConfirmRepository challengeConfirmRepository;
    private final ChallengeRepository challengeRepository;
    private final UserRepository userRepository;

    public ChallengeConfirmResponse execute(Long userId, Long challengeId, UpdateChallengeConfirmRequest request) {
        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;
        if(!challengeRepository.existsById(challengeId)) throw ChallengeNotFoundException.EXCEPTION;
        ChallengeConfirm challengeConfirm = challengeConfirmRepository.findByChallengeIdAndUserId(challengeId, userId);
        challengeConfirm.update(request.getCount());
        return new ChallengeConfirmResponse(challengeConfirm);
    }
}
