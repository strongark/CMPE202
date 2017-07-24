package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Scallions extends ToppingDecorator {

    public Scallions(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Scallions";
    }

}
