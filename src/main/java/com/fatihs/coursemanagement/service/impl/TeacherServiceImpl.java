package com.fatihs.coursemanagement.service.impl;

import com.fatihs.coursemanagement.dto.TeacherDto;
import com.fatihs.coursemanagement.entity.Teacher;
import com.fatihs.coursemanagement.dao.TeacherRepository;
import com.fatihs.coursemanagement.service.TeacherService;
import com.fatihs.coursemanagement.util.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    private final ModelMapper modelMapper;

    public TeacherServiceImpl(TeacherRepository teacherRepository, ModelMapper modelMapper) {

        this.teacherRepository = teacherRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public TeacherDto save(TeacherDto teacher) {

        Teacher teacherDb = modelMapper.map(teacher, Teacher.class);
        teacherDb = teacherRepository.save(teacherDb);
        return modelMapper.map(teacherDb, TeacherDto.class);
    }

    @Override
    public TeacherDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<TeacherDto> getAllPageable(Pageable pageable) {
        Page<Teacher> data = teacherRepository.findAll(pageable);
        TPage page = new TPage<TeacherDto>();
        TeacherDto[] dtos = modelMapper.map(data.getContent(), TeacherDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(TeacherDto teacher) {
        return null;
    }
}
