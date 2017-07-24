package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class HoneyMustard extends SauceDecorator {


    Burger burger;
    public HoneyMustard(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Honey Mustard";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
