package com.springboot.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.properties");
        MailConfiguration conf = context.getBean("mailConfiguration", MailConfiguration.class);
        conf.getMailConfiguration();
    }
}
