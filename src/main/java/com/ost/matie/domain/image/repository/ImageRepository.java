package com.ost.matie.domain.image.repository;

import com.ost.matie.domain.image.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long>, ImageRepositoryCustom {
}
