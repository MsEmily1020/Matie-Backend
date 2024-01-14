package com.ost.matie.service.clear;

import com.ost.matie.domain.clear.Clear;
import com.ost.matie.dto.clear.AddClearRequest;
import com.ost.matie.dto.clear.UpdateClearRequest;
import com.ost.matie.repository.ClearRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ClearService {
    private final ClearRepository clearRepository;

    public Clear save(AddClearRequest request) {
        return clearRepository.save(request.toEntity());
    }

    public List<Clear> findAllByUserId(Long userId) {
        return clearRepository.findAllByUserId(userId);
    }

    public Clear findFirstByUserIdAndDate(Long userId, LocalDate date) {
        return clearRepository.findFirstByUserIdAndDate(userId, date);
    }

    @Transactional
    public Clear update(Long userId, LocalDate date, UpdateClearRequest request) {
        Clear clear = clearRepository.findFirstByUserIdAndDate(userId, date);
        clear.update(request.getChallenge());
        return clear;
    }
}
