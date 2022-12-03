package com.springboot.mailproperties;

public class Mail {

    private String host;
    private int port;
    private String user;
    private String pass;

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void getMail(){
        System.out.println("Host: "+ host);
        System.out.println("Port: "+ port);
        System.out.println("User: "+ user);
        System.out.println("Pass: "+ pass);
    }
}
