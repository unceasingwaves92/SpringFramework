package com.springboot.autowiring;

public class Marks {

    private int mark1;
    private int mark2;
    private int mark3;

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    public void getMarkDetails(){
        System.out.println("Mark1: "+ mark1);
        System.out.println("Mark2: "+ mark2);
        System.out.println("Mark3: "+ mark3);
    }


}
