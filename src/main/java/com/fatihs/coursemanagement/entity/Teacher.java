package com.fatihs.coursemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "teachers")
public class Teacher extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "surname", length = 100)
    private String surname;

    @Column(name = "department")
    @Enumerated(EnumType.STRING)
    private Department department;

    @ManyToMany(mappedBy = "teachers")
    private List<Student> students;

    @ManyToMany
    @JoinTable(name = "teacher_lesson", joinColumns = {@JoinColumn(name = "TEACHER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "LESSON_ID")}
    )
    private List<Lesson> lessons = new ArrayList<Lesson>();
}
