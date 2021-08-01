package com.dro.budgetmanager.repository;

import com.dro.budgetmanager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<List<Product>> getProductByDateBetween(LocalDate fromDate , LocalDate upToDate);
}
