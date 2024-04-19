package com.ost.matie.global.validator;

import com.ost.matie.global.annotation.UserId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class UserIdValidator implements ConstraintValidator<UserId, String> {
    private static final String regexUserId = "(?=.*[0-9])(?=.*[a-zA-Z]).{6,12}";
    private static final Pattern PATTERN = Pattern.compile(regexUserId);

    @Override
    public boolean isValid(String userId, ConstraintValidatorContext context) {
        if (!matches(userId)) return false;
        return true;
    }

    public boolean matches(String userId) { return PATTERN.matcher(userId).matches(); }
}
