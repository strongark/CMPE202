package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ChipotleAioli extends SauceDecorator {

    Burger burger;
    public ChipotleAioli(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Chipotle Aioli";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
