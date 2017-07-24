package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class DanishBlueCheese extends CheeseDecorator {


    Burger burger;
    public DanishBlueCheese(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Danish Blue Cheese";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
