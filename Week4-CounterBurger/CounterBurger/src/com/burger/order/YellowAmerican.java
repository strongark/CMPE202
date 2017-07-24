package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class YellowAmerican extends CheeseDecorator {


    public YellowAmerican(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Yellow American ";
    }

}
