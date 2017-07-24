package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ApricotSauce extends SauceDecorator {


    Burger burger;
    public ApricotSauce(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Apricot Sauce";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
