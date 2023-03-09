package com.example.democonnectionjdbc.service;

import com.example.democonnectionjdbc.dao.EmployeeDao;
import com.example.democonnectionjdbc.ds.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

   // @Transactional
    public void createEmployeeTransaction(){
        employeeDao.createEmployee(new Employee(12,"Matin","Odegard","odegard@gmail.com",9000));
        employeeDao.createEmployee(new Employee(13,"Erling","Halaand","halaand@gmail.com",10000));
        employeeDao.createEmployee(new Employee(14,"Thomas","Partey","partey@gmail.com",90000));
        employeeDao.createEmployee(new Employee(15,"Lisandro","Trossard","trossard@gmail.com",90060));
    }

}
