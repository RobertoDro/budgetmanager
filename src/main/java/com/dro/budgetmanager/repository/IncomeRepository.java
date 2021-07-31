package com.dro.budgetmanager.repository;

import com.dro.budgetmanager.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IncomeRepository extends JpaRepository<Income, Long> {

    Optional<List<Income>> getIncomeByDateBetween(LocalDate from, LocalDate to);
}
