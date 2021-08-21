package com.sample.bank.accountservice.resource;

import com.sample.bank.accountservice.enums.TypeOfAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "accounts-collection")
public class Account {
    @Id
    private String id;
    private BigInteger accountNumber;
    private BigDecimal accountBalance;
    private TypeOfAccount accountType;
    private String customerId;
    private LocalDate dateOfLastWithdrawal;
}
