package com.example.democallbacktemplate.service;

import com.example.democallbacktemplate.ds.Employee;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> listAllEmployee(){
        return jdbcTemplate.query("select * from employee",
//                (a,b)->mapEmployee(a,b)
                this::mapEmployee
        );
    }
    @SneakyThrows
    private Employee mapEmployee(ResultSet rs,int i){
      return new Employee(
              rs.getInt("id"),
              rs.getString("first_name"),
              rs.getString("last_name"),
              rs.getString("email"),
              rs.getDouble("salary")

      );

    }



    }

