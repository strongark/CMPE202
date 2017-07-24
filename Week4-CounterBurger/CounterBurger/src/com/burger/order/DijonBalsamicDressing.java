package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class DijonBalsamicDressing extends SauceDecorator {


    Burger burger;
    public DijonBalsamicDressing(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Dijon Balsamic Dressing ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
