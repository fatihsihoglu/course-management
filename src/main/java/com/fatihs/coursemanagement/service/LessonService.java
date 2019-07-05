package com.fatihs.coursemanagement.service;

import com.fatihs.coursemanagement.entity.Lesson;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LessonService {

   Lesson save(Lesson lesson);

   Lesson getById(Long id);

   Page<Lesson> getAllPageable(Pageable pagebale);

   Boolean delete(Lesson lesson);
}
