package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Tomatoes extends ToppingDecorator {

    public Tomatoes(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Tomatoes ";
    }
}
