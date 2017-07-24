package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Sprouts extends ToppingDecorator {


    Burger burger;
    public Sprouts(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Sprouts ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
