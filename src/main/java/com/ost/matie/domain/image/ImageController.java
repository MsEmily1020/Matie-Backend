package com.ost.matie.domain.image;

import com.ost.matie.domain.image.Image;
import com.ost.matie.domain.image.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ImageController {
    private final ImageService imageService;

    @GetMapping("/image/{type}")
    public List<Image> findAllByTypeImage(@PathVariable Integer type) {
        return imageService.execute(type);
    }
}
