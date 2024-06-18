package com.ost.matie.domain.character.repository;

import com.ost.matie.domain.character.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
