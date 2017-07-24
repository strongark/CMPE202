package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ColeSlaw extends ToppingDecorator {


    Burger burger;
    public ColeSlaw(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Cole Slaw ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
