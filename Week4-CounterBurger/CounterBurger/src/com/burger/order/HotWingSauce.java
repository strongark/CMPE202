package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class HotWingSauce extends SauceDecorator {


    Burger burger;
    public HotWingSauce(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Hot Wing Sauce";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
