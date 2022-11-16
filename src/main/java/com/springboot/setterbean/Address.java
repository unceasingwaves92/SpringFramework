package com.springboot.setterbean;

public class Address {

    private int empPlot;
    private String empArea;
    private String empCity;

    public void setEmpPlot(int empPlot) {
        this.empPlot = empPlot;
    }

    public void setEmpArea(String empArea) {
        this.empArea = empArea;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public void getAddressDetails(){
        System.out.println("EmpPlot:" +empPlot);
        System.out.println("EmpArea: " +empArea);
        System.out.println("EmpCity: " + empCity);
    }
}
