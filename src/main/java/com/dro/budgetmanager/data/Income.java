package com.dro.budgetmanager.data;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double amount;

    private Timestamp date;

    @ManyToOne(targetEntity = Wallet.class)
    private Wallet wallet;
}
