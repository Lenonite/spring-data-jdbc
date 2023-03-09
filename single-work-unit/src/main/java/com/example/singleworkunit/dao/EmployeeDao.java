package com.example.singleworkunit.dao;

import com.example.singleworkunit.ds.Employee;
import com.example.singleworkunit.ds.Employee;
import lombok.SneakyThrows;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

@Repository
public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public EmployeeDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);


    }
    public  void deleteAllEmployee(){
        jdbcTemplate.execute("delete from employee");
    }
    public List<Employee>listAllEmployee(){
        return jdbcTemplate.query("""
                select * from employee
                """,this::mapEmployee);
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

    public void createEmployee(Employee employee) {
        if(employee.getId()<0){
            throw new RuntimeException("id cannot be negative!");
        }
        jdbcTemplate.update("""
                                        insert into employee (id,first_name,last_name,email,salary) values (?,?,?,?,?);
                        """, employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail(),
                employee.getSalary()

        );
    }
}
