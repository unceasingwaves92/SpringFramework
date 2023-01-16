package com.springboot.di5;

import org.springframework.stereotype.Component;

@Component
public class HdfcBank implements Bank{
    @Override
    public void service() {
        System.out.println("HDFC bank service");
    }
}
