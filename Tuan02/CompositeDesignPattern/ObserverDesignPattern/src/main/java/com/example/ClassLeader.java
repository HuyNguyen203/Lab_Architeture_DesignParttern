package com.example;

public class ClassLeader {
    private ClassRoom classRoom;

    public ClassLeader(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public void sendAnnouncement(String message) {
        classRoom.notifyObservers(message);
    }
}
