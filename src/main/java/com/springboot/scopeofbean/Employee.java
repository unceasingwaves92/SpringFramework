package com.springboot.scopeofbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Singleton;

@Scope("singleton")
@Component
public class Employee {

    @Value("karthik")
    private String empName;
    @Value("11")
    private int empID;
    @Value("Senior full stack developer")
    private String empDesignation;

    public Employee() {
        this.empName = empName;
        this.empID = empID;
        this.empDesignation = empDesignation;
    }

    public void getEmpDetails() {
        System.out.println("Emp name: "+ empName);
        System.out.println("Emp ID: "+ empID);
        System.out.println("Emp Designation: "+ empDesignation);
    }

}
