package com.ost.matie.domain.image.repository;

import com.ost.matie.domain.image.Image;

import java.util.List;

public interface ImageRepositoryCustom {
    List<Image> findAllByType(Integer type);
}
