package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class BlackForestHam extends ToppingDecorator {


    Burger burger;
    public BlackForestHam(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Black Forest Ham";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
