package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Mayonnaise extends SauceDecorator {

    public Mayonnaise(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Mayonnaise";
    }

}
