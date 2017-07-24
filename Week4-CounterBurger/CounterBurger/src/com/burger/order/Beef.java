package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Beef extends Burger{

    public Beef(){
        description = "Beef Burger";
    }

    @Override
    public double cost() {
        return 3;
    }
}
