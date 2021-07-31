package com.dro.budgetmanager.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double amount;

    private LocalDate date;

    @ManyToOne(targetEntity = Wallet.class)
    private Wallet wallet;
}
