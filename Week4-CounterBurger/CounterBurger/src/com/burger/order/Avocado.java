package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Avocado extends ToppingDecorator {

    public Avocado(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Avocado";
    }

    @Override
    public double cost() {
        return 1.5  + burger.cost();
    }
}
