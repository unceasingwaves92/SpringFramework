package com.springboot.di3;

import org.springframework.stereotype.Component;

@Component
public class Toyota implements Vehicle{
    @Override
    public void Engine() {
        System.out.println("Toyota engine");
    }
}
