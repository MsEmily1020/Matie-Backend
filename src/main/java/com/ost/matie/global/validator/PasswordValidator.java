package com.ost.matie.global.validator;

import com.ost.matie.global.annotation.Password;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class PasswordValidator implements ConstraintValidator<Password, String> {
    private static final String regexPassword = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}";
    private static final Pattern PATTERN = Pattern.compile(regexPassword);

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if (!matches(password)) return false;
        return true;
    }

    public boolean matches(String password) { return PATTERN.matcher(password).matches(); }
}
