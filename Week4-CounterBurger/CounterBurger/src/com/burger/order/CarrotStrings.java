package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class CarrotStrings extends ToppingDecorator {

    public CarrotStrings(Burger burger){
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + ", Carrot Strings ";
    }

}