package com.springboot.di4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.di4");
        Employee itEmployee = context.getBean("employee", Employee.class);
        itEmployee.getITEmployee();

        BankEmployee bankEmployee = context.getBean("bankEmployee", BankEmployee.class);
        bankEmployee.getBankEmployee();

        GovtEmployee govtEmployee = context.getBean("govtEmployee", GovtEmployee.class);
        govtEmployee.getGovtEmployee();
    }
}
