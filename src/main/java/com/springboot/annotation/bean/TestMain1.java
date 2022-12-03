package com.springboot.annotation.bean;

import com.springboot.ioc.applicationcontext.classpath.Employee1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain1 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.annotation.bean");
        EmployeeInjBean emp = context.getBean("empinj", EmployeeInjBean.class);
        emp.getEmployeeInjBeanDetails();
    }
}
