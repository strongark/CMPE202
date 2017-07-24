package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ApricotSauce extends SauceDecorator {

    public ApricotSauce(Burger burger){
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + ", Apricot Sauce";
    }

}
