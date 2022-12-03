package com.springboot.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

        @Value("karthik")
        private String empName;
        @Value("11")
        private int empId;
        @Value("Senior full stack developer")
        private String empDesignation;

        public void getEmployeeDetails(){
            System.out.println("Employee name: "+ empName);
            System.out.println("Employee Id: "+ empId);
            System.out.println("Employee designation: "+ empDesignation);
        }


    }


