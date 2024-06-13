package com.farhaan.banking.application.service.impl;

import com.farhaan.banking.application.dto.AccountDto;
import com.farhaan.banking.application.entity.Account;
import com.farhaan.banking.application.entity.mapper.AccountMapper;
import com.farhaan.banking.application.repository.Accountrepo;
import com.farhaan.banking.application.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl  implements AccountService {

    private Accountrepo accountrepo;   // this object is in bean provided  by spring

    public AccountServiceImpl(Accountrepo accountrepo) {
        this.accountrepo = accountrepo;
    }

    @Override
    public AccountDto createAccount(AccountDto accountdto) {
        Account account = AccountMapper.DtoToAccount(accountdto);
        Account savedAccount = accountrepo.save(account);
        return AccountMapper.accountToDto(savedAccount);
    }
}
