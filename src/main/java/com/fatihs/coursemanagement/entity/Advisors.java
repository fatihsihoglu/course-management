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
@Table(name = "advisors")
public class Advisors {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name_surname", length = 100)
    private String nameSurname;

    @OneToMany(mappedBy = "advisors")
    private List<Student> students = new ArrayList<>();
}
