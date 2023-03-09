package com.example.interoperability.dao;

import com.example.interoperability.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {


}
