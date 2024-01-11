package com.ost.matie.repository;

import com.ost.matie.domain.community.Community;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityRepository extends JpaRepository<Community, Long> {
}
