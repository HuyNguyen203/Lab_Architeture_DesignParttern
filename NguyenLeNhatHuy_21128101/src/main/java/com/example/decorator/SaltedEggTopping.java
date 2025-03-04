package com.example.decorator;

interface Pizza {
    String getDescription();
}

class BasicPizza implements Pizza {
    public String getDescription() {
        return "Basic Pizza";
    }
}

class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }
}

class SeafoodTopping extends ToppingDecorator {
    public SeafoodTopping(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + " + Seafood";
    }
}
public class SaltedEggTopping extends ToppingDecorator {
    public SaltedEggTopping(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + " + Salted Egg";
    }
}
