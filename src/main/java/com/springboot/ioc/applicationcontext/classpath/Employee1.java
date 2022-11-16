package com.springboot.ioc.applicationcontext.classpath;

public class Employee1 {

    private int employeeId;
    private String employeeName;

    public Employee1(){
        System.out.println("ClassPathXmlApplicationContext");
        this.employeeId = 1;
        this.employeeName = "karthik";
    }

    public void getEmployeeDetails() {
        System.out.println("Get employee Id and employee Name:"+ employeeId+ ":" +employeeName);
    }
}
