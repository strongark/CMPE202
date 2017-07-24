package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class YellowAmerican extends CheeseDecorator {


    Burger burger;
    public YellowAmerican(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Yellow American ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
