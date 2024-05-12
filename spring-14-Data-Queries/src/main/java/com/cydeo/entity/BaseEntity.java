package com.cydeo.entity;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.jpa.repository.JpaRepository;
@MappedSuperclass
public class BaseEntity  {
@Id
    private Long id;

}
