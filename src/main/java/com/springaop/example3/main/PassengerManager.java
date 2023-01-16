package com.springaop.example3.main;

import com.springaop.example3.dao.PassengerDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PassengerManager {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springaop.example3");
       // context.scan("com.springaop.example3");
     //   context.refresh();
        PassengerDao passengerDao = context.getBean("passengerDaoImpl", PassengerDao.class);

        System.out.println(passengerDao.getPassenger(1));
        System.out.println(passengerDao.getPassengerName("karthik"));
       // context.close();
    }
}