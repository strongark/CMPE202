package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Mayonnaise extends SauceDecorator {


    Burger burger;
    public Mayonnaise(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Mayonnaise";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
