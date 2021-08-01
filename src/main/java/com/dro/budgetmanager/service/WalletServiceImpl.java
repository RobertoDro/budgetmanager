package com.dro.budgetmanager.service;

import com.dro.budgetmanager.mapping.WalletMapper;
import com.dro.budgetmanager.model.Wallet;
import com.dro.budgetmanager.modelDTO.WalletDTO;
import com.dro.budgetmanager.repository.WalletRepository;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService{

    private final WalletRepository walletRepository;
    private final WalletMapper walletMapper;

    public WalletServiceImpl(WalletRepository walletRepository, WalletMapper walletMapper) {
        this.walletRepository = walletRepository;
        this.walletMapper = walletMapper;
    }

    @Override
    public WalletDTO getWalletById(Long id) {
        Wallet wallet = walletRepository.getById(id);
        return walletMapper.walletToWalletDTO(wallet);
    }

    @Override
    public WalletDTO createWallet(WalletDTO walletDTO) {
        Wallet saveWallet = walletMapper.walletDTOToWallet(walletDTO);
        walletRepository.save(saveWallet);
        return walletDTO;
    }

    @Override
    public void deleteWalletById(Long id) {
        Wallet wallet = walletRepository.getById(id);
        walletRepository.delete(wallet);
    }
}
