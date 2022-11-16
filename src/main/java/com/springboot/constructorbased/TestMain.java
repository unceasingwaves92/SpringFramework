package com.springboot.constructorbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorbean.xml");
        Student stu = context.getBean("student", Student.class);
        stu.getStudentDetails();
    }
}
