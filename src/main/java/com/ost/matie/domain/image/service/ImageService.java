package com.ost.matie.domain.image.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.image.Image;
import com.ost.matie.global.exception.TypeNotFoundException;
import com.ost.matie.domain.image.repository.ImageRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ReadOnlyService
@RequiredArgsConstructor
public class ImageService {
    private final ImageRepository imageRepository;

    public List<Image> execute(Integer type) {
        if(!(type == 1 || type == 2 || type == 3 || type == 4)) throw TypeNotFoundException.EXCEPTION;
        return imageRepository.findAllByType(type);
    }
}
