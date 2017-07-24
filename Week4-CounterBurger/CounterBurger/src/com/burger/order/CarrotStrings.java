package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class CarrotStrings extends ToppingDecorator {


    Burger burger;
    public CarrotStrings(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Carrot Strings ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}