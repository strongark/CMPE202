package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public abstract class Burger {

    String description = "Unknown Burger";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
