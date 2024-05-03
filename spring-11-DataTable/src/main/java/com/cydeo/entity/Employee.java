package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity// when ever you put @Entity annotation  top of the class  your table is created
public class Employee {
    @Id// by @Id annotation we do this field primary key
    private int id;
    private String name;


}
