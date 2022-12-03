package com.springboot.autowiring;

public class Student1 {

    private int studentId;
    private String studentName;
    private String address;
    private Marks marks;

    public Student1(Marks marks) {
        this.marks = marks;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

     public void getStudentDetails(){
        System.out.println("studentId: " + studentId);
        System.out.println("studentName: " + studentName);
        System.out.println("address: " + address);
        marks.getMarkDetails();
    }
}

