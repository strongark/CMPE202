package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SharpProvoine extends CheeseDecorator {


    Burger burger;
    public SharpProvoine(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Sharp Provoine";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
