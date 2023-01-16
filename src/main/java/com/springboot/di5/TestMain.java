package com.springboot.di5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.di5");
        User user = context.getBean("user", User.class);
        user.getUser();
    }
}
