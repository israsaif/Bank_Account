package com.example.New.Bank.Account.System.Models;

import org.hibernate.annotations.Entity;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    Integer id;
    Integer cardNumber;
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

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
