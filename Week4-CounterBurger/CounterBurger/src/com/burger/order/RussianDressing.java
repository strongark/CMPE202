package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class RussianDressing extends SauceDecorator {

    public RussianDressing(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Russian Dressing";
    }

}
