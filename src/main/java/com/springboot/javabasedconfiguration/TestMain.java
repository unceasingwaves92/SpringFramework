package com.springboot.javabasedconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.javabasedconfiguration");
        Date date = context.getBean("date", Date.class);
        System.out.println(date);
    }
}
