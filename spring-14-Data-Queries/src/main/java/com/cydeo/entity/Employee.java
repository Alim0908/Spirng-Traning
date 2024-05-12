package com.cydeo.entity;

import com.cydeo.enums.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jdk.jshell.spi.SPIResolutionException;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "employees")
public class Employee extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Integer salary;

    private Department department;

}
