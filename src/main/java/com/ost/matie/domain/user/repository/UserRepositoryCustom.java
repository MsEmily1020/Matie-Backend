package com.ost.matie.domain.user.repository;

import com.ost.matie.domain.user.User;

public interface UserRepositoryCustom {
    User findByUserIdOrEmail(String userId, String email);
    User findByEmail(String email);
}
