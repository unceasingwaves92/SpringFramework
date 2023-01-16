package com.springboot.di6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Employee {

    @Value("karthik")
    private String empName;
    @Value("11")
    private int empID;

    public Employee(){
        this.empName = empName;
        this.empID = empID;
    }

    @PostConstruct
    public void initializeMethod() {
        System.out.println("Verify database connection");
    }

    @PreDestroy
    public void closeMethod() {
        System.out.println("Close the database connection");
    }

    public void getEmployee() {
        System.out.println("Employee name: "+ empName);
        System.out.println("Employee ID: "+ empID);
    }



}
