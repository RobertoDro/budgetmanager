package com.dro.budgetmanager.dataDTO;

import com.dro.budgetmanager.data.ProductType;
import com.dro.budgetmanager.data.Wallet;
import lombok.*;

import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

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

    private Timestamp date;

    private ProductType type;

}
