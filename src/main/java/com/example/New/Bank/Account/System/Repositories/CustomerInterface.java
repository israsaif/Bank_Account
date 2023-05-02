package com.example.New.Bank.Account.System.Repositories;

import com.example.New.Bank.Account.System.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerInterface extends JpaRepository<Customer,Integer> {
    @Query(value = "SELECT id from customer where customer_name= :customerName",nativeQuery = true)
    Integer getCustomerById(@Param("customerName") String customerName);
    @Query("SELECT s from Customer s where s.id= : customerId")
    Customer getStudentByName(@Param("customerId") Integer customerId);
}
