package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class InABowlServe extends ServeDecorator {

    Burger burger;
    public InABowlServe(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", In A Bowl";
    }

    @Override
    public double cost() {
        return burger.cost() + 1;
    }
}
