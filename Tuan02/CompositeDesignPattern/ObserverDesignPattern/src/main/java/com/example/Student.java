package com.example;

public class Student implements Observer{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " nhận thông báo: " + message);
    }
}


