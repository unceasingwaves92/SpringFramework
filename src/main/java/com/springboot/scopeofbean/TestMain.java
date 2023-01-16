package com.springboot.scopeofbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.scopeofbean");
        // singleton
        Employee emp = context.getBean("employee", Employee.class);
        emp.getEmpDetails();
        System.out.println(emp.hashCode());

        Employee emp1 = context.getBean("employee", Employee.class);
        emp1.getEmpDetails();
        System.out.println(emp1.hashCode());

        // prototype
        Bank bank = context.getBean("bank", Bank.class);
        bank.getBankDetails();
        System.out.println(bank.hashCode());

        Bank bank1 = context.getBean("bank", Bank.class);
        bank1.getBankDetails();
        System.out.println(bank1.hashCode());
    }
}
