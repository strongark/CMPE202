package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class FriedOnionStrings extends ToppingDecorator {


    public FriedOnionStrings(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Fried Onion Strings";
    }

    @Override
    public double cost() {
        return 1.5  + burger.cost();
    }
}
