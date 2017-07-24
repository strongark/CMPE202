package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Scallions extends ToppingDecorator {


    Burger burger;
    public Scallions(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Scallions";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
