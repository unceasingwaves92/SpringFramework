package com.springboot.di6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.di6");
        Employee emp = context.getBean("employee", Employee.class);
        emp.getEmployee();
        context.close();
    }
}
