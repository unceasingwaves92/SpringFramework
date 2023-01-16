package com.springboot.di2;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.di2");
        Organization org = context.getBean("organization", Organization.class);
        org.getOrganizationDetails();
        System.out.println(org.hashCode());
        Organization org1 = context.getBean("organization", Organization.class);
        org1.getOrganizationDetails();
        System.out.println(org1.hashCode());
    }
}
