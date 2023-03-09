package com.example.one_to_onedemo;

import com.example.one_to_onedemo.entity.Customer;
import com.example.one_to_onedemo.service.CustomerService;
import com.example.one_to_onedemo.util.JPAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneDemoApplication implements CommandLineRunner {
    @Autowired
    private CustomerService customerService;
    public static void main(String[] args) {
        SpringApplication.run(OneToOneDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        customerService.createDb();
        Customer customer=customerService.findCustomerbyId(1);
        System.out.println(
                String.format("%s lives in  %s",customer.getName(),customer.getAddress().getCity())
        );
        JPAUtil.checkData("select * from customer");
        JPAUtil.checkData("select * from address");

    }
}
