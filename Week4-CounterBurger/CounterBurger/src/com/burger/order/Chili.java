package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Chili extends ToppingDecorator {


    Burger burger;
    public Chili(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Chili";
    }

    @Override
    public double cost() {
        return 1.5  + burger.cost();
    }
}
