package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SweetBBQSauce extends SauceDecorator {

    public SweetBBQSauce(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Sweet Barbeque Sauce ";
    }

}
