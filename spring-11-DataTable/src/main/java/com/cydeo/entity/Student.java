package com.cydeo.entity;

import com.cydeo.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(name = "studentFirstName")
    private String firstName;
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate brithDate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime birthDateTime;

    @Enumerated(EnumType.STRING)
//    @Enumerated(EnumType.ORDINAL)
    private Gender gender;

    @Transient
    private String city;


}
