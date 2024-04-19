package com.ost.matie.domain.community.repository;

import com.ost.matie.domain.community.Community;

import java.util.List;

public interface CommunityRepositoryCustom {
    List<Community> findByTypeOrderByCreatedDateDesc(String type);
}
