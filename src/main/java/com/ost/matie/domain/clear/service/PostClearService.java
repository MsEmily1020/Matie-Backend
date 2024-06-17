package com.ost.matie.domain.clear.service;

import com.ost.matie.domain.challenge.exception.ChallengeNotFoundException;
import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.domain.clear.dto.AddClearRequest;
import com.ost.matie.domain.clear.exception.UserClearDuplicateException;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.challenge.repository.ChallengeRepository;
import com.ost.matie.domain.clear.repository.ClearRepository;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@TransactionalService
@RequiredArgsConstructor
public class PostClearService {
    private final ClearRepository clearRepository;
    private final UserRepository userRepository;
    private final ChallengeRepository challengeRepository;

    public void execute(AddClearRequest request) {
        if(clearRepository.existsByUserIdAndChallengeIdAndDate(
                request.getUser().getId(),
                request.getChallenge().getId(),
                LocalDate.now()
        )) throw UserClearDuplicateException.EXCEPTION;
        if(!userRepository.existsById(request.getUser().getId())) throw UserNotFoundException.EXCEPTION;
        if(!challengeRepository.existsById(request.getChallenge().getId())) throw ChallengeNotFoundException.EXCEPTION;

        clearRepository.save(request.toEntity());
    }
}
