package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class GrilledPineapple extends ToppingDecorator {


    Burger burger;
    public GrilledPineapple(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Grilled Pineapple";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
