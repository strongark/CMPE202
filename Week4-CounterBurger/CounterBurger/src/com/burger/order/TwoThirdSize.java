package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class TwoThirdSize extends SizeDecorator {

    Burger burger;
    public TwoThirdSize(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", 2/3lb";
    }

    @Override
    public double cost() {
        return 11.50 + burger.cost();
    }
}
