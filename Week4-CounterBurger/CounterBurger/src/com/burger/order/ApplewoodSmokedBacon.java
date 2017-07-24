package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ApplewoodSmokedBacon extends ToppingDecorator {


    Burger burger;
    public ApplewoodSmokedBacon(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Apple wood smoked Bacon";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
