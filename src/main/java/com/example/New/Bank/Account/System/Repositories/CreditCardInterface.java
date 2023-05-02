package com.example.New.Bank.Account.System.Repositories;

import com.example.New.Bank.Account.System.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardInterface extends JpaRepository<Account,Integer> {
}
