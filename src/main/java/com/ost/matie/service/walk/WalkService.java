package com.ost.matie.service.walk;

import com.ost.matie.domain.user.Users;
import com.ost.matie.domain.walk.Walk;
import com.ost.matie.dto.user.UpdateUserRequest;
import com.ost.matie.dto.walk.AddWalkRequest;
import com.ost.matie.dto.walk.UpdateWalkRequest;
import com.ost.matie.repository.WalkRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class WalkService {
    private final WalkRepository walkRepository;

    public Walk save(AddWalkRequest request) {
        return walkRepository.save(request.toEntity());
    }

    public List<Walk> findAllByUserId(Long userId) {
        return walkRepository.findAllByUserId(userId);
    }

    public Walk findByUserIdAndDate(Long userId, LocalDate date) {
        return walkRepository.findByUserIdAndDate(userId, date);
    }

    @Transactional
    public Walk update(Long userId, LocalDate date, UpdateWalkRequest request) {
        Walk walk = walkRepository.findByUserIdAndDate(userId, date);
        walk.update(request.getCount());
        return walk;
    }
}
