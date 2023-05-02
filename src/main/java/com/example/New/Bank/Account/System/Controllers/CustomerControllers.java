package com.example.New.Bank.Account.System.Controllers;

import com.example.New.Bank.Account.System.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping(value = "Customer")
    public class CustomerControllers {
        @Autowired
        CustomerServices customerServices;

        @RequestMapping(value = "PersonalInformation", method = RequestMethod.POST)
        public String addPersonalInformation() {
            customerServices.addPersonalInformation();

            return "Customer add successful";
        }
}
