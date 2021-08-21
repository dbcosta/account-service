package com.sample.bank.accountservice;

import com.sample.bank.accountservice.enums.TypeOfAccount;
import com.sample.bank.accountservice.resource.Account;
import org.bson.types.ObjectId;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@SpringBootApplication
public class AccountServiceApplication implements CommandLineRunner {
	private MongoTemplate mongoTemplate;

	public AccountServiceApplication(MongoTemplate mongoTemplate){
	    this.mongoTemplate=mongoTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	Account newAccount = new Account(new ObjectId().toString(), BigInteger.valueOf(231212342), new BigDecimal(331344.4342), TypeOfAccount.SAVINGS, "323412", LocalDate.now());
		mongoTemplate.save(newAccount);
    }
}
