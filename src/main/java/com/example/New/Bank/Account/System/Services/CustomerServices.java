package com.example.New.Bank.Account.System.Services;

import com.example.New.Bank.Account.System.Models.Customer;
import com.example.New.Bank.Account.System.Repositories.CustomerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    public class CustomerServices {

    //insret Create a new account for a customer.
    Customer customer;
        @Autowired
        CustomerInterface customerInterface;
        public void addPersonalInformation(){
            Customer customer=new Customer();
            customer.setCustomerName("Isra");
            customer.setEmail("Isra.123@gmail.com");
            customer.setPhoneNumber(97224390);
            customerInterface.save(customer);
        }
}
