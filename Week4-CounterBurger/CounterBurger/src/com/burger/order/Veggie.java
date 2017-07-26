package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Veggie extends Burger {

    public Veggie(){
        description = "Veggie Burger";
    }
    @Override
    public double cost() {
        return 0;
    }
}
