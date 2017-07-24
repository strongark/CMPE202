package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class HardBoiledEggs extends ToppingDecorator {



    public HardBoiledEggs(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Hard Boiled Eggs";
    }

}
