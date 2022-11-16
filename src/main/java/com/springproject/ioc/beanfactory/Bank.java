package com.springproject.ioc.beanfactory;

public class Bank {

    private String bankName;
    private int bankIfsc;
    private String bankBranch;

    public Bank(){
        System.out.println("Default constructor of bank");
        this.bankName = "ICICI";
        this.bankIfsc = 0000123;
        this.bankBranch = "chennai";


    }
    public void getBankDetails(){
        System.out.println("Bank details:"+ bankName+ ":" +bankIfsc+ ":" +bankBranch);
    }
}
