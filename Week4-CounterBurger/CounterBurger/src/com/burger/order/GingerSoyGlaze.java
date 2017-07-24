package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class GingerSoyGlaze extends SauceDecorator {


    Burger burger;
    public GingerSoyGlaze(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Ginger Soy Glaze ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
