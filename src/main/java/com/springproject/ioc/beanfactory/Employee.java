package com.springproject.ioc.beanfactory;

public class Employee {

    private int employeeId;
    private String employeeName;

    public Employee(){
        System.out.println("Default constructor of employee");
        this.employeeId = 1;
        this.employeeName = "karthik";
    }

    public void getEmployeeDetails() {
        System.out.println("Get employee Id and employee Name:"+ employeeId+ ":" +employeeName);
    }
}
