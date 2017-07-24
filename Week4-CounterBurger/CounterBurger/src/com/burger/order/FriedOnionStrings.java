package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class FriedOnionStrings extends ToppingDecorator {


    Burger burger;
    public FriedOnionStrings(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Fried Onion Strings";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
