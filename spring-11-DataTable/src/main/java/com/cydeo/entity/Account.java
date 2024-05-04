package com.cydeo.entity;

import jakarta.persistence.Id;

import java.math.BigDecimal;

public class Account {
    @Id
    private Long id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;
}
