package com.springboot.constructorbased;

public class Marks {
    private int mark1;
    private int mark2;
    private int mark3;

    public Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void getMarkDetails(){
        System.out.println("Mark1: "+ mark1);
        System.out.println("Mark2: "+ mark2);
        System.out.println("Mark3: "+ mark3);
    }
}
