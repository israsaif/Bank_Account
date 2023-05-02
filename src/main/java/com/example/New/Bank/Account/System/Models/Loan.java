package com.example.New.Bank.Account.System.Models;

import lombok.Data;
import org.hibernate.annotations.Entity;

import javax.persistence.*;

@Entity
@Data
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Integer Id;
   String CustomerName;
    Double amount;
    Data startDate;
    Data endDate;
    Double balance;

    @ManyToOne
    @JoinColumn( name = "customer_id",  referencedColumnName = "id")
    Customer customer;
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Data getStartDate() {
        return startDate;
    }

    public void setStartDate(Data startDate) {
        this.startDate = startDate;
    }

    public Data getEndDate() {
        return endDate;
    }

    public void setEndDate(Data endDate) {
        this.endDate = endDate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
