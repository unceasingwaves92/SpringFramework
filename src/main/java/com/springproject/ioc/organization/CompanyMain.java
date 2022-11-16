package com.springproject.ioc.organization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CompanyMain {
    public static void main(String[] args) {
        // when initialization during create a object is called eagerly loading
        ApplicationContext context = new ClassPathXmlApplicationContext("beanorganization.xml");
        ApplicationContext con = new FileSystemXmlApplicationContext("E:\\Full Stack Development\\Spring boot\\beanorganization.xml");
        // return type is object so we can either typecasting or classname.class
        Company cmp = context.getBean("org", Company.class);
        cmp.getCompanyDetails();
        Company cmp1 = con.getBean("org", Company.class);
        cmp1.getCompanyDetails();


        }
    }