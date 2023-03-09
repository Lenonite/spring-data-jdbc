package com.example.singleworkunit.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private  String email;
    private double salary;
}
