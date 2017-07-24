package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SpicyPepperoncinis extends ToppingDecorator {


    Burger burger;
    public SpicyPepperoncinis(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Spicy Pepperoncinis ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
