package com.ost.matie.domain.character;

import com.ost.matie.domain.character.dto.CharacterResponse;
import com.ost.matie.domain.character.dto.UpdateCharacterRequest;
import com.ost.matie.domain.character.service.GetCharacterListService;
import com.ost.matie.domain.character.service.GetCharacterService;
import com.ost.matie.domain.character.service.PutCharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/character")
public class CharacterController {
    private final GetCharacterListService getCharacterListService;
    private final GetCharacterService getCharacterService;
    private final PutCharacterService putCharacterService;

    @GetMapping
    public List<CharacterResponse> getCharacterList() {
        return getCharacterListService.execute();
    }

    @GetMapping("/{id}")
    public CharacterResponse getCharacter(@PathVariable("id") Long id) {
        return getCharacterService.execute(id);
    }

    @PutMapping("/{id}")
    public CharacterResponse updateCharacter(@PathVariable("id") Long id, @RequestBody UpdateCharacterRequest request) {
        return putCharacterService.execute(id, request);
    }
}
