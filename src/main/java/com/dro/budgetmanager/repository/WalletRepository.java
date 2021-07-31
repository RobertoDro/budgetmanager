package com.dro.budgetmanager.repository;

import com.dro.budgetmanager.data.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
