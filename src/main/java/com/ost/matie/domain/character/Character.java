package com.ost.matie.domain.character;

import com.ost.matie.global.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "characters")
public class Character extends BaseEntity {
    private String name;
    private String description;

    public void update(String name) {
        this.name = name;
    }
}
