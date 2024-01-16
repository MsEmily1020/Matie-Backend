package com.ost.matie.controller.image;

import com.ost.matie.dto.image.ImageResponse;
import com.ost.matie.service.image.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ImageController {
    private final ImageService imageService;

    @GetMapping("/image/{type}")
    public ResponseEntity<List<ImageResponse>> findAllByTypeImage(@PathVariable Integer type) {
        List<ImageResponse> imageResponses = imageService.findAllByType(type)
                .stream()
                .map(ImageResponse::new)
                .toList();

        return ResponseEntity.ok().body(imageResponses);
    }
}
