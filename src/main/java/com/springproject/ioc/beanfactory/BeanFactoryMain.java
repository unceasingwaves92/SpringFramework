package com.springproject.ioc.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryMain {

    public static void main(String[] args) {

        // During initialization is not create object is called lazy loading
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanfactory.xml"));
        // return type is object so we can either typecasting or classname.class
        Employee emp = beanFactory.getBean("employee", Employee.class);
        emp.getEmployeeDetails();
        Bank bank = (Bank) beanFactory.getBean("bank");
        bank.getBankDetails();
    }
}
