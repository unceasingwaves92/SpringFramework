package com.springboot.di2;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Scope("prototype")
@Component
public class Organization {

    @Value("Google")
    private String orgName;
   // @Value("Sundar pitchai")
   // private String ceoName;
    @Value("1995")
    private int established;

    @Autowired
    private Employee employee;

    @Autowired(required = false)
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void getOrganizationDetails() {
        System.out.println("Organization name: "+ orgName);
      // System.out.println("CEO name: "+/ ceoName);
        System.out.println("Established org: "+ established);
        employee.getEmployee();
        address.getAddressDetails();
    }
}
