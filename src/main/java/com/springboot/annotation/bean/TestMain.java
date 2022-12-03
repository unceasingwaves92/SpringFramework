package com.springboot.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.annotation.bean");
        Employee emp = context.getBean("emp", Employee.class);
        emp.getEmployeeDetails();
    }
}
