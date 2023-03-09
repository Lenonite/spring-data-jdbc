package com.example.interoperability.action;

import com.example.interoperability.ds.Employee;
import com.example.interoperability.service.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeAction {
    @Autowired

    private EmployeeService employeeService;

    public void deleteEmployee(){
        employeeService.deleteAll();
    }
    public Iterable<Employee> findAll(){
       return employeeService.listEmployee();
    }
@Transactional
    public void createEmployee(){

        employeeService.createEmployeeWithJdbc(1,"John","DOE","johndoe@gmail.com",90000);
        employeeService.createEmployeeWithJdbc(2,"John","Wick","johnwick@gmail.com",99000);
        employeeService.createEmployeeWIthJpa(new Employee(3,"DErrick","Malik","derickmalik@gmail.com",50000));

        throw new RuntimeException();
    }

}
