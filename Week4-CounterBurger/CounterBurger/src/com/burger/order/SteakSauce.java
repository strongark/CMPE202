package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SteakSauce extends SauceDecorator {

    public SteakSauce(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Steak Sauce";
    }

}
