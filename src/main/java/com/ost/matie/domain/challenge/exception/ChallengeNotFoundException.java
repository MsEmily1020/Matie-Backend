package com.ost.matie.domain.challenge.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class ChallengeNotFoundException extends BusinessException {
    public static final BusinessException EXCEPTION = new ChallengeNotFoundException();
    private ChallengeNotFoundException() { super(ErrorCode.CHALLENGE_NOT_FOUND); }
}