package com.fatihs.coursemanagement.service.impl;

import com.fatihs.coursemanagement.entity.Lesson;
import com.fatihs.coursemanagement.dao.LessonRepository;
import com.fatihs.coursemanagement.service.LessonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl implements LessonService {

    private final LessonRepository lessonRepository;

    public LessonServiceImpl(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    @Override
    public Lesson save(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    @Override
    public Lesson getById(Long id) {
        return null;
    }

    @Override
    public Page<Lesson> getAllPageable(Pageable pagebale) {
        return null;
    }

    @Override
    public Boolean delete(Lesson lesson) {
        return null;
    }
}
