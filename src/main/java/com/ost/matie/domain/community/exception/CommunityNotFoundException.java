package com.ost.matie.domain.community.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class CommunityNotFoundException extends BusinessException {
    public static final BusinessException EXCEPTION = new CommunityNotFoundException();
    private CommunityNotFoundException() { super(ErrorCode.COMMUNITY_NOT_FOUND); }
}
