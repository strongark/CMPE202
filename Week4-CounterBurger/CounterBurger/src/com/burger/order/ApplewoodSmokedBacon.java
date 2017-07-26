package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ApplewoodSmokedBacon extends ToppingDecorator {



    public ApplewoodSmokedBacon(Burger burger){
        super(burger);
    }


    public String getDescription() {
        return burger.getDescription() + ", Apple wood smoked Bacon";
    }

    public double cost() {
        return 1.5 + burger.cost();
    }
}
