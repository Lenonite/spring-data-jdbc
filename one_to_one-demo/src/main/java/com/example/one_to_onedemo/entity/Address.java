package com.example.one_to_onedemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String streetName;
    private String streetNumber;
    private String city;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "customer_id_fk")
    private Customer customer;

    public Address() {
    }

    public Address(String streetName, String streetNumber, String city) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
    }
}
