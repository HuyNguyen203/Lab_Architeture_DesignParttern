package com.example;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom implements Subject{
    private String className;
    private List<Observer> students = new ArrayList<>();

    public ClassRoom(String className) {
        this.className = className;
    }

    @Override
    public void addObserver(Observer observer) {
        students.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        students.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        System.out.println("Thông báo từ lớp trưởng lớp " + className + ": " + message);
        for (Observer student : students) {
            student.update(message);
        }
    }
}
