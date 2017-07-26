package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SpicyPepperoncinis extends ToppingDecorator {

    public SpicyPepperoncinis(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Spicy Pepperoncinis ";
    }

}
