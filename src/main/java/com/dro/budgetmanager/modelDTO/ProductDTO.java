package com.dro.budgetmanager.modelDTO;

import com.dro.budgetmanager.model.ProductType;
import com.dro.budgetmanager.model.Wallet;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Long id;
    private Wallet wallet;
    @NotNull
    private String name;
    @Min(0)
    private Double price;

    private LocalDate date;

    private ProductType type;

}
