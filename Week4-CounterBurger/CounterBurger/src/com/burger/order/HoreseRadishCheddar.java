package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class HoreseRadishCheddar extends CheeseDecorator {

//    Burger burger;
    public HoreseRadishCheddar(Burger burger){
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + ",Horse Radish Cheddar ";
    }
}
