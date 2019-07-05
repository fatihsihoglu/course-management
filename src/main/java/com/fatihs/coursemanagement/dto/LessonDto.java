package com.fatihs.coursemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LessonDto {

    private Long id;
    private String name;
    private String code;
    private int credit;
    private List<StudentDto> students;
    private List<TeacherDto> teachers;
}
