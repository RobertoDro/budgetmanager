package com.dro.budgetmanager.service;

import com.dro.budgetmanager.modelDTO.IncomeDTO;

import java.time.LocalDate;
import java.util.List;

public interface IncomeService {

   IncomeDTO getIncomeDTOById(Long id);
   List<IncomeDTO> getAllIncomes();
   IncomeDTO saveIncome(IncomeDTO incomeDTO);
   IncomeDTO editIncome(Long id, IncomeDTO incomeDTO);
   List<IncomeDTO> getIncomesByDateBetween(LocalDate fromDate, LocalDate upToDate);
}
