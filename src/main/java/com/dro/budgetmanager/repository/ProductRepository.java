package com.dro.budgetmanager.repository;

import com.dro.budgetmanager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<List<Product>> getProductByDateBetween(LocalDate from , LocalDate to);
}
