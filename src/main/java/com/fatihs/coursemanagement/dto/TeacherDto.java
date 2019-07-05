package com.fatihs.coursemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {

    private Long id;
    private String name;
    private String surname;
    private List<StudentDto> students;
    private List<LessonDto> lessons;
}
