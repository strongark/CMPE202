package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class OneThirdSize extends SizeDecorator {

    Burger burger;
    public OneThirdSize(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", 1/3lb ";
    }

    @Override
    public double cost() {
        return burger.cost() + 9.50;
    }
}
