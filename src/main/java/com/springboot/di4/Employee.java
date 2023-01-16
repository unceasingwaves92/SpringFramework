package com.springboot.di4;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private int empId;
    private String empName;
    private String empOrg;

    public Employee() {
        System.out.println("Default constructor: ITEmployee");
        this.empId = 11;
        this.empName = "Karthik";
        this.empOrg = "Amazon";

    }

    public void getITEmployee() {
        System.out.println("Employee ID: "+ empId);
        System.out.println("Employee Name: "+ empName);
        System.out.println("Employee org: "+ empOrg);
    }


}
