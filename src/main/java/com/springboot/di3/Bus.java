package com.springboot.di3;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle {
    @Override
    public void Engine() {
        System.out.println("Bus engine");
    }
}
