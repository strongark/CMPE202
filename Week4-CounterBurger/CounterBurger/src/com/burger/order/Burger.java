package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public abstract class Burger {

    protected int toppingCount = 4;

    protected int cheeseCount = 1;

    protected int sauceCount = 1;

    protected String description = "Unknown Burger";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
