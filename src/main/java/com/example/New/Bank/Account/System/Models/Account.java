package com.example.New.Bank.Account.System.Models;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    Integer id;
    String AccountName;
   Double balance;
    @ManyToOne
    @JoinColumn( name = "customer_id",  referencedColumnName = "id")
    Customer customer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountName(String s) {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public Double getBalance(int i) {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
