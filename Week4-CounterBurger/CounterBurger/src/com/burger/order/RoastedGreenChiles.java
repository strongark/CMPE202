package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class RoastedGreenChiles extends ToppingDecorator {


    Burger burger;
    public RoastedGreenChiles(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Roasted Green Chiles ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
