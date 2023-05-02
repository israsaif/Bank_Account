package com.example.New.Bank.Account.System.Services;

import com.example.New.Bank.Account.System.Models.Account;
import com.example.New.Bank.Account.System.Models.Customer;
import com.example.New.Bank.Account.System.Repositories.AccountInterface;
import com.example.New.Bank.Account.System.Repositories.CustomerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServices {
   @Autowired
   AccountInterface accountInterface;

    @Autowired
    CustomerInterface customerInterface;

    Account account;
    public void  AccountForAcustomer(Customer customer)  {

        account.getAccountName();
        account.getId();
        account.getBalance();
    }
}