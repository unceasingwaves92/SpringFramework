package com.springboot.scopebean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("beanscope.xml");

            Employee emp1 = context.getBean("emp", Employee.class);
            emp1.getEmployeeDetails();
            System.out.println(emp1.hashCode());

            Employee emp2 = context.getBean("emp", Employee.class);
            emp2.getEmployeeDetails();
            System.out.println(emp2.hashCode());

        }


}
