package com.fatihs.coursemanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "students")
public class Student {

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

    @ManyToMany
    @JoinTable(name = "student_teacher", joinColumns = {@JoinColumn(name = "STUDENT_ID")},
            inverseJoinColumns = {@JoinColumn(name = "TEACHER_ID")}
    )
    private List<Teacher> teachers = new ArrayList<Teacher>();

    @ManyToMany
    @JoinTable(name = "student_lesson", joinColumns = {@JoinColumn(name = "STUDENT_ID")},
            inverseJoinColumns = {@JoinColumn(name = "LESSON_ID")}
    )
    private List<Lesson> lessons = new ArrayList<Lesson>();

    @ManyToOne
    @JoinColumn(name = "danismanId")
    private Advisors advisors;
}
