package com.springaop.example3.model;

public class Passenger {
    private int id;
    private String name;

   public Passenger(int id) {
        this.id = id;

    }
    public Passenger(String name){
       this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
