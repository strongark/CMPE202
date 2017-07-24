package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Sprouts extends ToppingDecorator {

    public Sprouts(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Sprouts ";
    }

}
