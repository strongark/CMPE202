package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class BlackOlives extends ToppingDecorator {


    Burger burger;
    public BlackOlives(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Black Olives ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
