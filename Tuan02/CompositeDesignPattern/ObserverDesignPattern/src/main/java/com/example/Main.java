package com.example;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom("DHKTPM17B");

        Student student1 = new Student("Nga");
        Student student2 = new Student("Huy");
        Student student3 = new Student("N.Anh");

        classRoom.addObserver(student1);
        classRoom.addObserver(student2);
        classRoom.addObserver(student3);

        ClassLeader leader = new ClassLeader(classRoom);

        leader.sendAnnouncement("Ngày mai nghỉ học nha!");

    }
}