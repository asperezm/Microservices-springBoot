package com.example.customerservice.repository;

import java.util.List;

import com.example.customerservice.repository.entity.Customer;
import com.example.customerservice.repository.entity.Region;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
    public Customer findByNumberID(String numberID);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByRegion(Region region);
}
