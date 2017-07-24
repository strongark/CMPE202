package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class HoreseRadishCheddar extends CheeseDecorator {


    Burger burger;
    public HoreseRadishCheddar(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Horse Radish Cheddar ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
