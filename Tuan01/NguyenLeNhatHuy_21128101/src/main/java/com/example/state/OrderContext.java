package com.example.state;

interface State {
    void handleRequest();
}

class Free implements State {
    public void handleRequest() {
        System.out.println("State: Free");
    }
}

class Ordered implements State {
    public void handleRequest() {
        System.out.println("State: Ordered");
    }
}

class Fixing implements State {
    public void handleRequest() {
        System.out.println("State: Fixing");
    }
}
public class OrderContext {
    private State currentState;

    public void setState(State state) {
        this.currentState = state;
    }

    public void handleRequest() {
        currentState.handleRequest();
    }

    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();

        Free free = new Free();
        Ordered ordered = new Ordered();
        Fixing fixing = new Fixing();

        orderContext.setState(free);
        orderContext.handleRequest();

        orderContext.setState(ordered);
        orderContext.handleRequest();

        orderContext.setState(fixing);
        orderContext.handleRequest();
    }
}
