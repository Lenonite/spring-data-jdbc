package com.example.one_to_onedemo.dao;

import com.example.one_to_onedemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer,Integer> {
}
