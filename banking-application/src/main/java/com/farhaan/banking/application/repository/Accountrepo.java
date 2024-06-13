package com.farhaan.banking.application.repository;

import com.farhaan.banking.application.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Accountrepo extends JpaRepository<Account, Long> {

}
