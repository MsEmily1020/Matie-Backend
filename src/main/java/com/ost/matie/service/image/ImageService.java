package com.ost.matie.service.image;

import com.ost.matie.domain.image.Image;
import com.ost.matie.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ImageService {
    private final ImageRepository imageRepository;

    public List<Image> findAllByType(Integer type) {
        return imageRepository.findAllByType(type);
    }
}
