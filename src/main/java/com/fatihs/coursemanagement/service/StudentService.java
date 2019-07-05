package com.fatihs.coursemanagement.service;

import com.fatihs.coursemanagement.dto.StudentDto;
import com.fatihs.coursemanagement.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {

   StudentDto save(StudentDto student);

   Student getById(Long id);

   Page<Student> getAllPageable(Pageable pagebale);

   Boolean delete(Student student);
}
