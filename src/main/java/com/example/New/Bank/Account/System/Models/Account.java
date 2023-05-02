package com.example.New.Bank.Account.System.Models;

import lombok.Data;
import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.util.function.DoubleUnaryOperator;

@Entity
@Data
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

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
