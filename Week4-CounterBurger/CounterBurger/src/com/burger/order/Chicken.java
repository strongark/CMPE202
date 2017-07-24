package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Chicken extends Burger {

    public Chicken(){
        description = "Chicken Burger";
    }

    @Override
    public double cost() {
        return 0;
    }
}
