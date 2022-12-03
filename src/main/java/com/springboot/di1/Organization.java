package com.springboot.di1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("org")
public class Organization {

    @Value("Emexo")
    private String orgName;
    @Value("Regu")
    private String ceoName;
    @Value("2015")
    private int established;
    @Autowired
    private Employee employee;

    @Autowired
    private Address address;

    public void getOrgDetails() {
        System.out.println("Organization name: "+ orgName);
        System.out.println("CEO name: "+ ceoName);
        System.out.println("Established: "+ established);
        employee.getEmployeeDetails();
        address.getAddress();
    }

    @PostConstruct
    public void init(){
        System.out.println("***************Post construct**********");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("******Pre destroy*********");
    }


}
