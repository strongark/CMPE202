package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class HorseRadishMayo extends SauceDecorator {

    public HorseRadishMayo(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Horse Radish Mayo";
    }

}
