package com.ost.matie.domain.user.repository;

import com.ost.matie.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
    boolean existsByUserId(String userId);
    boolean existsByEmail(String email);
}
