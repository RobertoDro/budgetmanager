package com.dro.budgetmanager.service;

import com.dro.budgetmanager.modelDTO.WalletDTO;

public interface WalletService {

    WalletDTO getWalletById(Long id);
    WalletDTO createWallet(WalletDTO walletDTO);
    void deleteWalletById(Long id);

}
