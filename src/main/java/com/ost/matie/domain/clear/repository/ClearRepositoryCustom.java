package com.ost.matie.domain.clear.repository;

import com.ost.matie.domain.clear.Clear;

import java.time.LocalDate;
import java.util.List;

public interface ClearRepositoryCustom {
    List<Clear> findByUserId(Long userId);
}
