package com.springboot.di5;

import org.springframework.stereotype.Component;

@Component
public class IciciBank implements Bank {

    @Override
    public void service() {
        System.out.println("ICICI bank service");
    }
}
