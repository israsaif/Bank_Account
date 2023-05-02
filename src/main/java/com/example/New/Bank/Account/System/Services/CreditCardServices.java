package com.example.New.Bank.Account.System.Services;

import com.example.New.Bank.Account.System.Models.CreditCard;
import com.example.New.Bank.Account.System.Models.Customer;
import com.example.New.Bank.Account.System.Repositories.CreditCardInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCardServices {
    @Autowired
    CreditCardInterface creditCardInterface;


    //insret Create a new account for a customer.
    public void addPersonalInformationcreditCard(){
       CreditCard  creditCard=new CreditCard();
        creditCard.getCardNumber();
        creditCard.getId();
        creditCard.getBalance();
    }
}
