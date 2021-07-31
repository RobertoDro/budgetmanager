package com.dro.budgetmanager.mapping;

import com.dro.budgetmanager.data.Wallet;
import com.dro.budgetmanager.dataDTO.WalletDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WalletMapper {

    WalletMapper INSTANCE = Mappers.getMapper(WalletMapper.class);

    WalletDTO walletToWalletDTO(Wallet wallet);
    Wallet walletDTOToWallet(WalletDTO walletDTO);

}
