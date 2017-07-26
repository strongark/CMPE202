package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class HotWingSauce extends SauceDecorator {

    public HotWingSauce(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Hot Wing Sauce";
    }

}
