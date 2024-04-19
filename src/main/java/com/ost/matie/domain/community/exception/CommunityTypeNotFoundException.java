package com.ost.matie.domain.community.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class CommunityTypeNotFoundException extends BusinessException {
    public static final BusinessException EXCEPTION = new CommunityTypeNotFoundException();
    private CommunityTypeNotFoundException() { super(ErrorCode.COMMUNITY_TYPE_NOT_FOUND); }
}
