package com.example.singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Private constructor to prevent instantiation
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();
    }
}
