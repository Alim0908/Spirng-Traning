package com.cydeo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass//Becouse this class will be parent class of other classes
public class BaseEntity {
    @Id // by @Id annotation we do this field primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
