package com.dro.budgetmanager.repository;

import com.dro.budgetmanager.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
