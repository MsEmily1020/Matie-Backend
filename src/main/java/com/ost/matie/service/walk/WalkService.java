package com.ost.matie.service.walk;

import com.ost.matie.domain.walk.Walk;
import com.ost.matie.dto.walk.AddWalkRequest;
import com.ost.matie.dto.walk.UpdateWalkRequest;
import com.ost.matie.exception.DataNotFoundException;
import com.ost.matie.exception.DuplicateException;
import com.ost.matie.repository.WalkRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class WalkService {
    private final WalkRepository walkRepository;

    public Walk save(AddWalkRequest request) {
        if(request.getCount() == null) request.setCount(0L);
        if(walkRepository.existsByUserIdAndDate(request.getUser().getId(), LocalDate.now()))
            throw new DuplicateException("이미 오늘의 사용자 기록은 존재합니다.");
        return walkRepository.save(request.toEntity());
    }

    public List<Walk> findAllByUserId(Long userId) {
        return walkRepository.findAllByUserId(userId);
    }

    public List<Walk> findAllSevenDays(Long userId) {
        List<Walk> walks = walkRepository.findAllByUserId(userId)
                .stream()
                .filter(walk -> walk.getDate().isAfter(LocalDate.now().minusDays(7)))
                .collect(Collectors.toList());

        return walks;
    }

    public Walk findFirstByUserIdAndDateOrderByDateDesc(Long userId, LocalDate date) {
        return walkRepository.findFirstByUserIdAndDateOrderByDateDesc(userId, date);
    }

    @Transactional
    public Walk update(Long userId, LocalDate date, UpdateWalkRequest request) {
        if(request.getCount() == null) request.setCount(0L);
        Walk walk = walkRepository.findFirstByUserIdAndDateOrderByDateDesc(userId, date);
        walk.update(request.getCount());
        return walk;
    }
}
