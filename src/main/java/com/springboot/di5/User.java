package com.springboot.di5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @Resource - JSR 250
 * Match by Name
 * Match by Type
 * Match by Qualifier
 * @Inject - JSR - 330
 * Match by Type
 * Match by Qualifier
 * Match by Name - @Named
 * @Autowired
 * Match by Type
 * Match by Qualifier
 * Match by Name
 */

@Component("user")
public class User {

    @Qualifier("iciciBank")
   // @Resource
   @Autowired

    Bank bank;

    public void getUser(){
        bank.service();
    }
}
