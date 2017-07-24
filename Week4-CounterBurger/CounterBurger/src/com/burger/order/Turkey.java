package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Turkey extends Burger {

    public Turkey(){
        description = "Turkey Burger";
    }

    @Override
    public double cost() {
        return 3;
    }
}
