package com.fatihs.coursemanagement.dao;

import com.fatihs.coursemanagement.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
