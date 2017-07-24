package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ImportedSwiss extends CheeseDecorator {


    Burger burger;
    public ImportedSwiss(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Imported Swiss";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
