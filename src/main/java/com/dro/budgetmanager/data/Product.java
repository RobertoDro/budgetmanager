package com.dro.budgetmanager.data;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    private Timestamp date;

    @Enumerated(value = EnumType.STRING)
    private ProductType type;

    @ManyToOne(targetEntity = Wallet.class)
    private Wallet wallet;
}
