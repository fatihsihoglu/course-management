package com.fatihs.coursemanagement.service.impl;

import com.fatihs.coursemanagement.entity.Advisors;
import com.fatihs.coursemanagement.dao.AdvisorRepository;
import com.fatihs.coursemanagement.service.AdvisorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AdvisorServiceImpl implements AdvisorService {

    private final AdvisorRepository advisorRepository;

    public AdvisorServiceImpl(AdvisorRepository advisorRepository) {

        this.advisorRepository = advisorRepository;
    }

    @Override
    public Advisors save(Advisors advisors) {

        return advisorRepository.save(advisors);
    }

    @Override
    public Advisors getById(Long id) {
        return null;
    }

    @Override
    public Page<Advisors> getAllPageable(Pageable pagebale) {
        return null;
    }

    @Override
    public Boolean delete(Advisors teachers) {
        return null;
    }
}
