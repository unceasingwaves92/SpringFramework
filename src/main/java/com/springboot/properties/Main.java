package com.springboot.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.properties");
        MailRead mail = context.getBean("mailRead", MailRead.class);
        mail.getMailConfiguration();
    }
}
