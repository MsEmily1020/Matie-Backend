package com.ost.matie.domain.character.service;

import com.ost.matie.domain.character.Character;
import com.ost.matie.domain.character.dto.CharacterResponse;
import com.ost.matie.domain.character.dto.UpdateCharacterRequest;
import com.ost.matie.domain.character.exception.CharacterNotFoundException;
import com.ost.matie.domain.character.repository.CharacterRepository;
import com.ost.matie.global.annotation.TransactionalService;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class PutCharacterService {
    private final CharacterRepository characterRepository;

    public CharacterResponse execute(Long id, UpdateCharacterRequest request) {
        Character character = characterRepository.findById(id)
                .orElseThrow(() -> CharacterNotFoundException.EXCEPTION);

        character.update(request.getName());

        return new CharacterResponse(character);
    }
}
