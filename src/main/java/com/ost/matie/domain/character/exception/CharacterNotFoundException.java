package com.ost.matie.domain.character.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class CharacterNotFoundException extends BusinessException {
    public static final BusinessException EXCEPTION = new CharacterNotFoundException();
    private CharacterNotFoundException() { super(ErrorCode.CHARACTER_NOT_FOUND); }
}
