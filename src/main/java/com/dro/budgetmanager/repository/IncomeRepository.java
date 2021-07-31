package com.dro.budgetmanager.repository;

import com.dro.budgetmanager.data.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}
