package com.ost.matie.dto.image;

import com.ost.matie.domain.image.Image;
import lombok.Getter;

@Getter
public class ImageResponse {
    private final Long id;
    private final String url;
    private final Integer type;

    public ImageResponse(Image image) {
        this.id = image.getId();
        this.url = image.getUrl();
        this.type = image.getType();
    }
}
