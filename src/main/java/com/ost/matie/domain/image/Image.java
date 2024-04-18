package com.ost.matie.domain.image;

import com.ost.matie.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Image extends BaseEntity {
    @Column(name = "url")
    private String url;

    @Column(name = "type")
    private Integer type;
}
