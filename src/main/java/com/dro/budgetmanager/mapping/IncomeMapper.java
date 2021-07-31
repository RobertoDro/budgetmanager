package com.dro.budgetmanager.mapping;

import com.dro.budgetmanager.model.Income;
import com.dro.budgetmanager.modelDTO.IncomeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IncomeMapper {

    IncomeMapper INSTANCE = Mappers.getMapper(IncomeMapper.class);

    IncomeDTO incomeToIncomeDTO(Income income);
    Income incomeDTOToIncome(IncomeDTO incomeDTO);

}
