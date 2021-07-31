package com.dro.budgetmanager.modelDTO;

import com.dro.budgetmanager.model.Income;
import com.dro.budgetmanager.model.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class WalletDTO {

    private Long id;

    private Double amount;

    private List<Product> spending = new ArrayList<>();

    private List<Income> incomes = new ArrayList<>();
}
