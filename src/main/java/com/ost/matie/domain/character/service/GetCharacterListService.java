package com.ost.matie.domain.character.service;

import com.ost.matie.domain.character.dto.CharacterResponse;
import com.ost.matie.domain.character.repository.CharacterRepository;
import com.ost.matie.global.annotation.ReadOnlyService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@ReadOnlyService
@RequiredArgsConstructor
public class GetCharacterListService {
    private final CharacterRepository characterRepository;

    public List<CharacterResponse> execute() {
        return characterRepository.findAll()
                .stream()
                .map(CharacterResponse::new)
                .collect(Collectors.toList());
    }
}
