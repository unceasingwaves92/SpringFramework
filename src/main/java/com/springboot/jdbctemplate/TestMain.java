package com.springboot.jdbctemplate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.jdbctemplate");
        ContactDAO contactDAO = context.getBean("contactDAO", ContactDAO.class);

        Contact contact = new Contact();
      //  contact.setId(2);
        contact.setName("karthik");
        contact.setEmail_id("karthik12@gmail.com");
        contact.setAddress("chennai");
        contact.setTelephone("111111");

        contactDAO.saveContact(contact);
        contact.setId(10);
        contact.setEmail_id("divya123@gmail.com");
       // contact.setName("lakshmi");
        contactDAO.updateContact(contact);

        contact.setEmail_id("karthik12@gmail.com");
        contactDAO.deleteContact(contact);

        System.out.println(contactDAO.getContacts());
        System.out.println(contactDAO.getContactById(10));

    }
}
