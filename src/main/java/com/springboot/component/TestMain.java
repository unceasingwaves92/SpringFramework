package com.springboot.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext("com.springboot.component");
        Employee emp = context.getBean(Employee.class);
        emp.getEmployeeDetails();
    }
}
