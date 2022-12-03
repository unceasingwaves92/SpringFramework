package com.springboot.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.di1");
        Organization org = context.getBean("org", Organization.class);
        org.getOrgDetails();

        // Not mandatory manually close the bean
        context.close();

    }
}
