package com.ost.matie.service.image;

import com.ost.matie.domain.image.Image;
import com.ost.matie.exception.TypeNotFoundException;
import com.ost.matie.repository.image.ImageRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ImageService {
    private final ImageRepository imageRepository;

    @Transactional
    public List<Image> execute(Integer type) {
        if(!(type == 1 || type == 2 || type == 3 || type == 4)) throw TypeNotFoundException.EXCEPTION;
        return imageRepository.findAllByType(type);
    }
}
