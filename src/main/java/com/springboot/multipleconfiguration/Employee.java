package com.springboot.multipleconfiguration;

public class Employee {

    private String empName;
    private String empDesignation;
    private int empId;

    public Employee(String empName, String empDesignation, int empId){
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empId = empId;
    }

    public void getEmploDetails() {
        System.out.println("Employee: "+ empName);
        System.out.println("Employee Designation: "+ empDesignation);
        System.out.println("Employee ID: "+ empId);
    }
}
