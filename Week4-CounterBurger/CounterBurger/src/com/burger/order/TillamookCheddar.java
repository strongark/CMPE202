package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class TillamookCheddar extends CheeseDecorator {


    Burger burger;
    public TillamookCheddar(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Tillamook Cheddar ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
