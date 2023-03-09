package com.example.interoperability;

import com.example.interoperability.action.EmployeeAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InteroperabilityApplication  implements CommandLineRunner {
    @Autowired
private EmployeeAction employeeAction;
    public static void main(String[] args) {
        SpringApplication.run(InteroperabilityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        employeeAction.deleteEmployee();
        try {
            employeeAction.createEmployee();
        }catch (Exception e){
            System.out.println("Exception caugh");
        }

        employeeAction.findAll().forEach(System.out::println);

    }
}
