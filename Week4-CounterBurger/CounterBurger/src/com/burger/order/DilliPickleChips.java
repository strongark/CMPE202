package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class DilliPickleChips extends ToppingDecorator {


    Burger burger;
    public DilliPickleChips(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Dilli Pickle Chips ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
