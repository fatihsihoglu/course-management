package com.fatihs.coursemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvisorDto {

    private Long id;
    private String nameSurname;
    private List<StudentDto> students;
}
