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

@RequiredArgsConstructor
@Service
public class WalkService {
    private final WalkRepository walkRepository;

    public Walk save(AddWalkRequest request) {
        if(walkRepository.existsByUserIdAndDate(request.getUser().getId(), LocalDate.now()))
            throw new DuplicateException("duplicate data by user id : " + request.getUser().getId() + ", date : " + LocalDate.now());
        return walkRepository.save(request.toEntity());
    }

    public List<Walk> findAllByUserId(Long userId) {
        List<Walk> walks = walkRepository.findAllByUserId(userId);
        if(walks.isEmpty()) throw new DataNotFoundException("No data by userId : " + userId);
        return walks;
    }

    public Walk findFirstByUserIdAndDateOrderByDateDesc(Long userId, LocalDate date) {
        Walk walk = walkRepository.findFirstByUserIdAndDateOrderByDateDesc(userId, date);
        if(walk == null) throw new DataNotFoundException("No data by userId : " + userId + ", date : " + date);
        return walkRepository.findFirstByUserIdAndDateOrderByDateDesc(userId, date);
    }

    @Transactional
    public Walk update(Long userId, LocalDate date, UpdateWalkRequest request) {
        Walk walk = walkRepository.findFirstByUserIdAndDateOrderByDateDesc(userId, date);
        if(walk == null) throw new DataNotFoundException("No data by userId : " + userId + ", date : " + date);
        walk.update(request.getCount());
        return walk;
    }
}
