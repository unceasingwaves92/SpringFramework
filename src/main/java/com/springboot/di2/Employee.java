package com.springboot.di2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("Karthik")
    private String empName;
    @Value("11")
    private int empID;
    @Value("Senior full stack developer")
    private String empRole;

    public void getEmployee() {
        System.out.println("Employee name: "+ empName);
        System.out.println("Employee ID: "+ empID);
        System.out.println("Employee role: "+ empRole);
    }



}
