package com.sample.bank.accountservice.controller;

import com.sample.bank.accountservice.resource.Account;
import com.sample.bank.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        Optional<Account> createdAccount = accountService.createAccount(account);
        if(createdAccount!=null && createdAccount.isPresent()){
            return new ResponseEntity<Account>(createdAccount.get(),HttpStatus.CREATED);
        }
        return new ResponseEntity<Account>(HttpStatus.BAD_REQUEST);
    }
}
