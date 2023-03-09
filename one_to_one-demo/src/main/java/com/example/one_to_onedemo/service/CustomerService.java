package com.example.one_to_onedemo.service;

import com.example.one_to_onedemo.dao.AddressDao;
import com.example.one_to_onedemo.dao.CustomerDao;
import com.example.one_to_onedemo.entity.Address;
import com.example.one_to_onedemo.entity.Customer;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService  {
    private final CustomerDao customerDao;
    private final AddressDao addressDao;

    public CustomerService(CustomerDao customerDao, AddressDao addressDao) {
        this.customerDao = customerDao;
        this.addressDao = addressDao;
    }
    public Customer findCustomerbyId(int id){
        return customerDao.findById(id).orElseThrow(EntityNotFoundException::new);
    }
    @Transactional

    public void createDb(){
        Customer customer1=new Customer("John Doe","555-555-555","johndoe@gmail.com");
        Customer customer2=new Customer("John GWy","555-555-656","johngway@gmail.com");

        Address address1=new Address("Bridge creek Road","NO.87","Yangon");
        Address address2=new Address("DreamLAnd","NO.11","MAndalay");
        //mapping
       address1.setCustomer(customer1);
       address2.setCustomer(customer2);
       customer1.setAddress(address1);
       customer2.setAddress(address2);

//        customerDao.save(customer1);
//        customerDao.save(customer2);
        addressDao.save(address1);
        addressDao.save(address2);
    }

}
