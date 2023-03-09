package com.example.singleworkunit;

import com.example.singleworkunit.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingleWorkUnitApplication  implements CommandLineRunner {
@Autowired
    private EmployeeService employeeService;
    public static void main(String[] args) {
        SpringApplication.run(SingleWorkUnitApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        try{
            employeeService.createEmployeeWithTransaction();

        }catch (Exception e){
            System.out.println("Exception caught");
        }
        employeeService.listALlEmployee().forEach(System.out::println);
        employeeService.deleteAllEmployee();
        System.out.println();
        try {
            employeeService.createEmployeewithoutTransaction();
        }catch (Exception e){
            System.out.println("Exception caught");
        }
        employeeService.listALlEmployee().forEach(System.out::println);
        employeeService.deleteAllEmployee();
    }
}
