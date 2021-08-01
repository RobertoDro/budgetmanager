package com.dro.budgetmanager.repository;

import com.dro.budgetmanager.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {

    Optional<List<Income>> getIncomeByDateBetween(LocalDate fromDate, LocalDate upToDate);
}
