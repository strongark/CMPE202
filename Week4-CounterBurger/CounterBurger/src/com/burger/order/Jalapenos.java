package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Jalapenos extends ToppingDecorator {


    Burger burger;
    public Jalapenos(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Jalapenos ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
