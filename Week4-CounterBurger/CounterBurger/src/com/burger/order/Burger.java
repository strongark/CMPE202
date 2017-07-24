package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public abstract class Burger {

    protected int toppingCount = 0;

    protected int cheeseCount = 0;

    protected int sauceCount = 0;

    protected String description = "Unknown Burger";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

//    public abstract int getCheeseCount();
//
//    public abstract int getSauceCount();
//
//    public abstract int getToppingCount();



}
