package com.springboot.di5;

import org.springframework.stereotype.Component;

@Component
public class AxisBank implements Bank{
    @Override
    public void service() {
        System.out.println("Axis bank service");
    }
}
