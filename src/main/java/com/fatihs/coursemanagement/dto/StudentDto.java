package com.fatihs.coursemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private Long id;
    private String name;
    private String surname;
    private List<TeacherDto> teachers;
    private List<LessonDto> lessons;
    private AdvisorDto advisors;
}
