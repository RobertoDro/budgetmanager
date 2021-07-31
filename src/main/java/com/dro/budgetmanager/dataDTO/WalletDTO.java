package com.dro.budgetmanager.dataDTO;

import com.dro.budgetmanager.data.Income;
import com.dro.budgetmanager.data.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
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
