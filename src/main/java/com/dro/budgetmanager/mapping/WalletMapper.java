package com.dro.budgetmanager.mapping;

import com.dro.budgetmanager.model.Wallet;
import com.dro.budgetmanager.modelDTO.WalletDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WalletMapper {

    WalletMapper INSTANCE = Mappers.getMapper(WalletMapper.class);

    WalletDTO walletToWalletDTO(Wallet wallet);
    Wallet walletDTOToWallet(WalletDTO walletDTO);

}
