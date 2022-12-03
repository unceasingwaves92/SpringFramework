package com.springboot.annotation.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("emp")
public class Employee {
    private int empID;
    private String empName;

    public Employee(){
        this.empID = 1;
        this.empName = "Karthik";
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: "+ empID);
        System.out.println("Employee Name: "+ empName);
    }
}
