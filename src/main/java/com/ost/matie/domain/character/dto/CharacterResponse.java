package com.ost.matie.domain.character.dto;

import com.ost.matie.domain.character.Character;
import lombok.Getter;

@Getter
public class CharacterResponse {
    private final Long id;
    private final String name;
    private final String description;
    private final String type;

    public CharacterResponse (Character character) {
        this.id = character.getId();
        this.name = character.getName();
        this.description = character.getDescription();
        this.type = character.getType();
    }
}
