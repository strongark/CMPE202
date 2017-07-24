package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Jalapenos extends ToppingDecorator {


    public Jalapenos(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Jalapenos ";
    }

}
