package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class BlackForestHam extends ToppingDecorator {



    public BlackForestHam(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Black Forest Ham";
    }

    @Override
    public double cost() {
        return 1.5  + burger.cost();
    }
}
