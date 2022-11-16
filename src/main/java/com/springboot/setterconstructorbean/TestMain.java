package com.springboot.setterconstructorbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setterconstructorbean.xml");
        Product product = context.getBean("pro", Product.class);
        product.getProductDetails();
    }
}
