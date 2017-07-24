package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SauteedMushrooms extends ToppingDecorator {


    Burger burger;
    public SauteedMushrooms(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Sauteed Mushrooms";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
