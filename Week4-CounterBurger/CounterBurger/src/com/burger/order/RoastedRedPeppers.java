package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class RoastedRedPeppers extends ToppingDecorator {


    Burger burger;
    public RoastedRedPeppers(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Roasted Red Peppers ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
