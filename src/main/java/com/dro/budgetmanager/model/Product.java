package com.dro.budgetmanager.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    private LocalDate date;

    @Enumerated(value = EnumType.STRING)
    private ProductType type;

    @ManyToOne(targetEntity = Wallet.class)
    private Wallet wallet;
}
