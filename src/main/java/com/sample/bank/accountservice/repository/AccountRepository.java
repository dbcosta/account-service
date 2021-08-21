package com.sample.bank.accountservice.repository;

import com.sample.bank.accountservice.resource.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account,String> {
}
