package com.springproject.ioc.organization;

public class Company {

    private String comName;
    private String designation;
    private int comRegNo;

    public Company(){

        this.comName = "Google";
        this.designation = "Java developer";
        this.comRegNo = 12345;
    }

    public void getCompanyDetails() {
        System.out.println("Get company information:"+ comName+ ":" +designation+ ":" +comRegNo);
    }
}
