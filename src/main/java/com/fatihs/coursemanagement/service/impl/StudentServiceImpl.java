package com.fatihs.coursemanagement.service.impl;

import com.fatihs.coursemanagement.dto.StudentDto;
import com.fatihs.coursemanagement.entity.Student;
import com.fatihs.coursemanagement.dao.StudentRepository;
import com.fatihs.coursemanagement.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public StudentDto save(StudentDto student) {

        Student studentDb = modelMapper.map(student, Student.class);
        studentDb = studentRepository.save(studentDb);
        return modelMapper.map(studentDb, StudentDto.class);
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.getOne(id);
    }

    @Override
    public Page<Student> getAllPageable(Pageable pagebale) {
        return studentRepository.findAll(pagebale);
    }

    @Override
    public Boolean delete(Student student) {
        return null;
    }
}
