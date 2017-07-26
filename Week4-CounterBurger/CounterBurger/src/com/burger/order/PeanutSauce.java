package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class PeanutSauce extends SauceDecorator {


    public PeanutSauce(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Peanut Sauce ";
    }

}
