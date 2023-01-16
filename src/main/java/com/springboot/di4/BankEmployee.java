package com.springboot.di4;

import org.springframework.stereotype.Service;

@Service
public class BankEmployee {

    private String bankName;
    private String banempName;

    public BankEmployee(){
        System.out.println("Default constructor: BankEmployee");
        this.bankName = "Woolworths financial service";
        this.banempName = "Karthik";
    }

    public void getBankEmployee(){
        System.out.println("Name of the bank: "+ bankName);
        System.out.println("Employee name: "+ banempName);

    }
}
