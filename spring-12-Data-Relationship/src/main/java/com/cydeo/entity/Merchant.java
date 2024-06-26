package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table()
@NoArgsConstructor
@Data
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;
    private String code;
    private BigDecimal transactionFee;
    private BigDecimal commissionFee;
    private Integer payoutDelayCount;

    @OneToMany(mappedBy = "merchant")//in one to many relationship ownership blogs to many side
    private List<Payment> payment;
    public Merchant(String name, String code, BigDecimal transactionFee, BigDecimal commissionFee, Integer payoutDelayCount) {
        this.name = name;
        this.code = code;
        this.transactionFee = transactionFee;
        this.commissionFee = commissionFee;
        this.payoutDelayCount = payoutDelayCount;
    }
}
