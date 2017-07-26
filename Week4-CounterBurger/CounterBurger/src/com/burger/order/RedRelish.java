package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class RedRelish extends SauceDecorator {


    public RedRelish(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Red Relish";
    }

}
