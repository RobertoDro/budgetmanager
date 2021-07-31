package com.dro.budgetmanager.mapping;

import com.dro.budgetmanager.data.Income;
import com.dro.budgetmanager.dataDTO.IncomeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IncomeMapper {

    IncomeMapper INSTANCE = Mappers.getMapper(IncomeMapper.class);

    IncomeDTO incomeToIncomeDTO(Income income);
    Income incomeDTOToIncome(IncomeDTO incomeDTO);

}
