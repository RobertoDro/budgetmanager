package com.dro.budgetmanager.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @OneToMany(mappedBy = "wallet", cascade = CascadeType.ALL)
    private List<Product> spending;

    @OneToMany(mappedBy = "wallet",cascade = CascadeType.ALL)
    private List<Income> incomes;
}
