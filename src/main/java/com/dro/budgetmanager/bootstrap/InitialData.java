package com.dro.budgetmanager.bootstrap;

import com.dro.budgetmanager.model.Income;
import com.dro.budgetmanager.model.Product;
import com.dro.budgetmanager.model.ProductType;
import com.dro.budgetmanager.model.Wallet;
import com.dro.budgetmanager.repository.IncomeRepository;
import com.dro.budgetmanager.repository.ProductRepository;
import com.dro.budgetmanager.repository.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InitialData implements CommandLineRunner {

    public final WalletRepository walletRepository;
    public final ProductRepository productRepository;
    public final IncomeRepository incomeRepository;

    public InitialData(WalletRepository walletRepository, ProductRepository productRepository, IncomeRepository incomeRepository) {
        this.walletRepository = walletRepository;
        this.productRepository = productRepository;
        this.incomeRepository = incomeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(walletRepository.count()==0){
            loadData();
        }

    }

    private void loadData() {

        Wallet wallet = new Wallet();
        wallet.setId(1L);
        wallet.setAmount(100.00);

        Product product1 = new Product();
        product1.setName("Iphone");
        product1.setPrice(60.0);
        product1.setDate(LocalDate.now());
        product1.setWallet(wallet);
        product1.setType(ProductType.ELECTRONIC_EQUIPMENT);

        Income income = new Income();
        income.setAmount(200.0);
        income.setDate(LocalDate.now());
        income.setName("Basic salary");
        income.setWallet(wallet);


        walletRepository.save(wallet);
        productRepository.save(product1);
        incomeRepository.save(income);
    }


}
