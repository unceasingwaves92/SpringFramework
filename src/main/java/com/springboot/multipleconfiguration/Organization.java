package com.springboot.multipleconfiguration;

public class Organization {

    private String comName;
    private String comBranch;


    public Organization(String comName, String comBranch){

        this.comName = comName;
        this.comBranch = comBranch;

    }

    public void getOrgDetails(){
        System.out.println("Company Name: "+ comName);
        System.out.println("Company branch: "+ comBranch);

    }
}
