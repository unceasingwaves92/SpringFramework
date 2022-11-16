package com.springboot.setterbean;

public class Employee {

    private String empName;
    private int empRollNo;
    private String empDesignation;

    private Address address;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpRollNo(int empRollNo) {
        this.empRollNo = empRollNo;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void getEmployeeeDetails() {
        System.out.println("EmpName:" + empName);
        System.out.println("EmpRolNo:" + empRollNo);
        System.out.println("EmpDesignation: " + empDesignation);
        address.getAddressDetails();
    }

}