package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class RedRelish extends SauceDecorator {


    Burger burger;
    public RedRelish(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Red Relish";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
