package com.ost.matie.repository;

import com.ost.matie.domain.image.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findAllByType(Integer type);
}
