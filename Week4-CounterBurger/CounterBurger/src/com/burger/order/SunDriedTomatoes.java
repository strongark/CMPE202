package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SunDriedTomatoes extends ToppingDecorator {


    public SunDriedTomatoes(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Sun Dried Tomatoes";
    }

    @Override
    public double cost() {
        return 1.5 + burger.cost();
    }
}
