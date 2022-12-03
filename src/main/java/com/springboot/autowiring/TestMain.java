package com.springboot.autowiring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
        Student stu = context.getBean("student", Student.class);
        stu.getStudentDetails();
        System.out.println("By name autowiring");

        Student stu1 = context.getBean("student1", Student.class);
        stu1.getStudentDetails();
        System.out.println("By type autowiring");

        Student stu2 = context.getBean("student2", Student.class);
        stu2.getStudentDetails();
        System.out.println("By default autowiring");

        Student1 stu3 = context.getBean("student3", Student1.class);
        stu3.getStudentDetails();
        System.out.println("By constructor autowiring");
    }
}
