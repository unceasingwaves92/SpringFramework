package com.springboot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@PropertySources({
        @PropertySource("classpath:mail.properties"),
        @PropertySource("classpath:db.properties")
})
//@PropertySource("classpath:mail.properties")
@Component
public class MailConfiguration {

    @Value("${smtp.host}")
    private String host;
    @Value("${smtp.port}")
    private int port;
    @Value("${smtp.user}")
    private String user;
    @Value("${smtp.pass}")
    private String pass;

    @Value("${server.name}")
    private String serName;

    @Value("${server.port}")
    private int dbPort;

    @Value("${server.username}")
    private String username;

    @Value("${server.password}")
    private String password;


    public void getMailConfiguration(){
        System.out.println("Host name: "+ host);
        System.out.println("Port no: "+ port);
        System.out.println("Username: "+ user);
        System.out.println("Password: "+ pass);
        System.out.println("Server name: "+ serName);
        System.out.println("Port number: "+ port);
        System.out.println("db username: "+ username);
        System.out.println("db password: "+ password);
    }

}
