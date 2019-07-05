package com.fatihs.coursemanagement.dao;

import com.fatihs.coursemanagement.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
