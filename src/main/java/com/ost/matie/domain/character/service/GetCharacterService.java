package com.ost.matie.domain.character.service;

import com.ost.matie.domain.character.Character;
import com.ost.matie.domain.character.dto.CharacterResponse;
import com.ost.matie.domain.character.exception.CharacterNotFoundException;
import com.ost.matie.domain.character.repository.CharacterRepository;
import com.ost.matie.global.annotation.ReadOnlyService;
import lombok.RequiredArgsConstructor;

@ReadOnlyService
@RequiredArgsConstructor
public class GetCharacterService {
    private final CharacterRepository characterRepository;

    public CharacterResponse execute(Long id) {
        Character character = characterRepository.findById(id)
                .orElseThrow(() -> CharacterNotFoundException.EXCEPTION);
        return new CharacterResponse(character);
    }
}
