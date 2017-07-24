package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Tomatoes extends ToppingDecorator {


    Burger burger;
    public Tomatoes(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Tomatoes ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
