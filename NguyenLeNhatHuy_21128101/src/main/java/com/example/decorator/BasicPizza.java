package com.example.decorator;

interface Pizza {
    String getDescription();

}

public class BasicPizza implements Pizza {
    public String getDescription() {
        return "Basic Pizza";
    }
    public static void main(String[] args) {
        BasicPizza basicPizza = new BasicPizza();
        System.out.println(basicPizza.getDescription());

        ToppingDecorator toppingDecorator = new ToppingDecorator(basicPizza);
        System.out.println(toppingDecorator.getDescription());

        SeafoodTopping seafoodTopping = new SeafoodTopping(toppingDecorator);
        System.out.println(seafoodTopping.getDescription());

        SaltedEggTopping saltedEggTopping = new SaltedEggTopping(seafoodTopping);
        System.out.println(saltedEggTopping.getDescription());

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
class SaltedEggTopping extends ToppingDecorator {
    public SaltedEggTopping(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + " + Salted Egg";
    }


}

