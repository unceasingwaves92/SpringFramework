package com.springboot.ioc.applicationcontext.classpath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationContextMain {

    public static void main(String[] args) {
       // ApplicationContext context = new
            //    ClassPathXmlApplicationContext("classpathxmlapplicationcontext.xml");
        ApplicationContext context = new
                FileSystemXmlApplicationContext("C:\\Users\\Dell\\IdeaProjects\\SpringProject\\src\\main\\resources\\classpathxmlapplicationcontext.xml");
        Employee1 emp = context.getBean("employee1", Employee1.class);
        emp.getEmployeeDetails();
    }


}
