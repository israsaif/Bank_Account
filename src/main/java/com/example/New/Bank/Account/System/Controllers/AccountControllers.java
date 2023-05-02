package com.example.New.Bank.Account.System.Controllers;

import com.example.New.Bank.Account.System.Models.Account;
import com.example.New.Bank.Account.System.Models.Customer;
import com.example.New.Bank.Account.System.Repositories.AccountInterface;
import com.example.New.Bank.Account.System.Services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "Account")
public class AccountControllers {



        @Autowired
      AccountServices accountServices;

        @RequestMapping(value = "PersonalInformation", method = RequestMethod.POST)
        public String AccountForAcustomer() {
            accountServices.AccountForAcustomer();
            return "Account add successful";
        }

}