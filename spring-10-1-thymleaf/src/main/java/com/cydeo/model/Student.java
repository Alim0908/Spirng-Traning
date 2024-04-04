package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String state;

}
