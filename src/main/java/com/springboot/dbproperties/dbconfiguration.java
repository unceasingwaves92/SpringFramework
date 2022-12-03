package com.springboot.dbproperties;

public class dbconfiguration {

    private String serverName;
    private int port;
    private String username;
    private String password;



    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void getDBDetails() {
        System.out.println("Server Name:" + serverName);
        System.out.println("Port no:" + port);
        System.out.println("Username:" + username);
        System.out.println("Password:" + password);


    }
}
