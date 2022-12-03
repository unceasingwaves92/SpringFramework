package com.springboot.di3;

import com.springboot.annotation.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.di3");
        User user = context.getBean("user", User.class);
        user.getBus();
    }
}
