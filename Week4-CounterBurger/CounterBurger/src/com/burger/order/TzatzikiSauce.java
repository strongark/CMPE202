package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class TzatzikiSauce extends SauceDecorator {

    public TzatzikiSauce(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Taztziki Sauce ";
    }

}
