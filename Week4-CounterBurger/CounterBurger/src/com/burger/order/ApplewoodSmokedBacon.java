package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ApplewoodSmokedBacon extends ToppingDecorator {


    Burger burger;
    public ApplewoodSmokedBacon(Burger burger){
        this.burger = burger;
    }


    public String getDescription() {
        return burger.getDescription() + ", Apple wood smoked Bacon";
    }

    public double cost() {
        return 1.5 + burger.cost();
    }
}
