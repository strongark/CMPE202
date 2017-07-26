package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class GreekFeta extends CheeseDecorator {


    public GreekFeta(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Greek Feta";
    }

}
