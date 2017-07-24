package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class OrganicMixedGreens extends ToppingDecorator {


    Burger burger;
    public OrganicMixedGreens(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Organic Mixed Greens";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
