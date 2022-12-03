package com.springboot.di1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Value("bangalore")
    private String city;
    @Value("mysore")
    private String district;
    @Value("bangalore")
    private String branch;

    public void getAddress() {
        System.out.println("City: "+ city);
        System.out.println("District: "+ district);
        System.out.println("Branch: "+ branch);
    }


}
