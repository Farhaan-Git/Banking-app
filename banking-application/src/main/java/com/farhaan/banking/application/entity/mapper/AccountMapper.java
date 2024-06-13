package com.farhaan.banking.application.entity.mapper;

import com.farhaan.banking.application.dto.AccountDto;
import com.farhaan.banking.application.entity.Account;

public class AccountMapper {

    public static Account DtoToAccount (AccountDto accountDto){
        Account account = new Account(
          accountDto.getId(),
          accountDto.getAccountHolderName(),
          accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto accountToDto(Account account){

        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
