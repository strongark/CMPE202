package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SteakSauce extends SauceDecorator {


    Burger burger;
    public SteakSauce(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Steak Sauce";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
