package com.cydeo.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    public  int id;
    private String firstname;
    private String lastName;
}
