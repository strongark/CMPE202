package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SpicySourCream extends SauceDecorator {

    public SpicySourCream(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Spicy Sour Cream ";
    }
}
