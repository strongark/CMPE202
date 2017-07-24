package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class RoastedGreenChiles extends ToppingDecorator {



    public RoastedGreenChiles(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Roasted Green Chiles ";
    }

}
