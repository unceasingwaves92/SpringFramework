package com.springboot.setterbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setterbean.xml");
        Student stu = context.getBean("student", Student.class);
        stu.getStudentDetails();
        Employee emp = context.getBean("employee", Employee.class);
        emp.getEmployeeeDetails();
    }

}
