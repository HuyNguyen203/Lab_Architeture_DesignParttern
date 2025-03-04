package com.example.factory;

interface Employee {
    void handleRequest();
}

class TeamLeader implements Employee {
    public void handleRequest() {
        System.out.println("Team Leader: Assign tasks and go on patrol");
    }
}

class Director implements Employee {
    public void handleRequest() {
        System.out.println("Director: Oversee all operations");
    }
}

class OfficeEmployee implements Employee {
    public void handleRequest() {
        System.out.println("Office Employee: Handle administrative tasks");
    }
}
public class EmployeeFactory {
    public static Employee createEmployee(String role) {
        switch (role) {
            case "Team Leader":
                return new TeamLeader();
            case "Director":
                return new Director();
            case "Office Employee":
                return new OfficeEmployee();
            default:
                throw new IllegalArgumentException("Invalid role");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Employee employee = EmployeeFactory.createEmployee("Team Leader");
            employee.handleRequest();
        }
    }

}
