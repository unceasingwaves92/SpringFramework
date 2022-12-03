package com.springboot.annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Repository("empinj")
public class EmployeeInjBean {

    @Value("1")
    private int empId;
    @Value("Karthik")
    private String empName;
    @Value("{karthik , regu, nisha, deepe}")
    String empNames[];
    @Value("{nisha, deepe, karthik}")
    List<String> building;

    public void getEmployeeInjBeanDetails(){
        System.out.println("Emp ID: "+ empId);
        System.out.println("Emp Name: "+ empName);
        System.out.println("Emp names: "+ Arrays.toString(empNames));
        System.out.println("Building: "+ building);
        for(String input: empNames){
            System.out.println(input);
        }
    }


}
