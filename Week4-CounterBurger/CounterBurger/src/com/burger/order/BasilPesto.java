package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class BasilPesto extends SauceDecorator {


    Burger burger;
    public BasilPesto(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Basil Pesto";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
