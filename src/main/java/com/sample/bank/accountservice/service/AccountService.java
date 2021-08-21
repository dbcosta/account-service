package com.sample.bank.accountservice.service;

import com.sample.bank.accountservice.repository.AccountRepository;
import com.sample.bank.accountservice.resource.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Optional<Account> createAccount(Account account) {
        return Optional.of(accountRepository.save(account));
    }
}
