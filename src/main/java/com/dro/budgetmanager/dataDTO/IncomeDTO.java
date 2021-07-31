package com.dro.budgetmanager.dataDTO;


import com.dro.budgetmanager.data.Wallet;
import lombok.*;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IncomeDTO {

    private Long id;
    private Wallet wallet;

    @NotNull
    private String name;
    @Min(0)
    private Double amount;
    private Timestamp date;

}
