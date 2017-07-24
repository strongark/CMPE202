package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class TzatzikiSauce extends SauceDecorator {


    Burger burger;
    public TzatzikiSauce(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Taztziki Sauce ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
