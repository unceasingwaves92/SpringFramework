package com.springboot.di2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Value("Perumbakkam")
    private String empArea;
    @Value("Chennai")
    private String empCity;
    @Value("Kanchipuram")
    private String empDistrict;

    public void getAddressDetails(){
        System.out.println("Employee Area: "+ empArea);
        System.out.println("Employee City: "+ empCity);
        System.out.println("Employee District: "+ empDistrict);
    }

}
