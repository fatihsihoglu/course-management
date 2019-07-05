package com.fatihs.coursemanagement.service;

import com.fatihs.coursemanagement.entity.Advisors;
import com.fatihs.coursemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AdvisorService {

   Advisors save(Advisors user);

   Advisors getById(Long id);

   Page<Advisors> getAllPageable(Pageable pagebale);

   Boolean delete(Advisors advisors);
}
