package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class HoneyMustard extends SauceDecorator {

    public HoneyMustard(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Honey Mustard";
    }

}
