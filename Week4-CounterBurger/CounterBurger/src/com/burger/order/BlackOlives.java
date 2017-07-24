package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class BlackOlives extends ToppingDecorator {

    public BlackOlives(Burger burger){
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + ", Black Olives ";
    }

}
