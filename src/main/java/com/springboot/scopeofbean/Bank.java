package com.springboot.scopeofbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Bank {

    @Value("divya")
    private String empName;
    @Value("ICICI")
    private String bankName;
    @Value("Chennai")
    private String bankBranch;

    public Bank() {
        this.empName = empName;
        this.bankName = bankName;
        this.bankBranch = bankBranch;
    }

    public void getBankDetails() {
        System.out.println("Employee name: "+ empName);
        System.out.println("Bank name: "+ bankName);
        System.out.println("Bank branch: "+ bankBranch);
    }

}
