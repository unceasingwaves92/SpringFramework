package com.springboot.multipleconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Organization1.xml", "Employee1.xml", "Address1.xml" );
        Organization org = context.getBean("organization", Organization.class);
        Employee emp = context.getBean("emp", Employee.class);
        Address address = context.getBean("address", Address.class);
        org.getOrgDetails();
        emp.getEmploDetails();
        address.getAddressDetails();
    }
}
