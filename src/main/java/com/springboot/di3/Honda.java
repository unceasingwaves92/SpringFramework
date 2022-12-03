package com.springboot.di3;

import org.springframework.stereotype.Component;

@Component
public class Honda implements Vehicle{
    @Override
    public void Engine() {
        System.out.println("Honda engine");
    }
}
