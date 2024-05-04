package com.cydeo.entity;

import com.cydeo.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name="employees")
@NoArgsConstructor
@AllArgsConstructor// we use this becouse lombok does not get the parent fiekd
@Entity// when ever you put @Entity annotation  top of the class  your table is created
public class Employee extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;

    @Column(columnDefinition ="DATE" )
    private LocalDate hireDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int salary;

}
