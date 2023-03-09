package com.example.one_to_onedemo.dao;

import com.example.one_to_onedemo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Address,Integer> {
}
