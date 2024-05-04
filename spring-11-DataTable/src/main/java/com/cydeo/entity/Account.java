package com.cydeo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@MappedSuperclass// means this class represents this class only providing inheritance relationship to other entities
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;
}
