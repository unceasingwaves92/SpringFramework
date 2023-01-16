package com.springboot.di4;

import org.springframework.stereotype.Repository;

@Repository
public class GovtEmployee {

    private String centralEmployee;
    private String branch;


public GovtEmployee() {
    System.out.println("Default constructor: GovtEmployee");
    this.centralEmployee = "IB";
    this.branch = "Chennai";
}

public void getGovtEmployee(){
    System.out.println("Central Employee name: "+ centralEmployee);
    System.out.println("Branch: "+ branch);
}
}