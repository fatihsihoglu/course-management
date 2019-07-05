package com.fatihs.coursemanagement.service;

import com.fatihs.coursemanagement.dto.TeacherDto;
import com.fatihs.coursemanagement.util.util.TPage;
import org.springframework.data.domain.Pageable;

public interface TeacherService {

    TeacherDto save(TeacherDto teacher);

    TeacherDto getById(Long id);

    TPage<TeacherDto> getAllPageable(Pageable pageable);

    Boolean delete(TeacherDto teacher);
}
