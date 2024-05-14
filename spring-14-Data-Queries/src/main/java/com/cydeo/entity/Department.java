package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "department")
@Data
public class Departmnet {
@Id
    private  String department;
    private String division;
}
