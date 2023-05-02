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


    //insret Create a new account for a customer.
    public void  AccountForAcustomer()  {
    Account account=new Account();
        account.setAccountName("Bank Muscat");
        account.setBalance(12.8);
        Integer id = customerInterface.getCustomerById("Isra");
        Customer customerId=customerInterface.getStudentByName(id);
        account.setCustomer(customerId);
        accountInterface.save(account);
    }
}