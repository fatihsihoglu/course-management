package com.fatihs.coursemanagement.dao;

import com.fatihs.coursemanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
