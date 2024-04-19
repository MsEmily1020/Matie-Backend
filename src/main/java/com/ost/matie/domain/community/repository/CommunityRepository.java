package com.ost.matie.domain.community.repository;

import com.ost.matie.domain.community.Community;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityRepository extends JpaRepository<Community, Long>, CommunityRepositoryCustom {
}
