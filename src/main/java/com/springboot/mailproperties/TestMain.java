package com.springboot.mailproperties;

import com.springboot.setterbean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mailconfiguration.xml");
        Mail mail = context.getBean("mail", Mail.class);
        mail.getMail();
    }
}
