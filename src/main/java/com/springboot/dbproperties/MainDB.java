package com.springboot.dbproperties;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDB {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dbconfiguration.xml");
        dbconfiguration dbconfiguration = context.getBean("db", dbconfiguration.class);
        dbconfiguration.getDBDetails();
        MailConfiguration mail1 = context.getBean("mail", MailConfiguration.class);
        mail1.getMail();

    }

}
