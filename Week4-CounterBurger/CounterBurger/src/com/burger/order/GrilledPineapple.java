package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class GrilledPineapple extends ToppingDecorator {

    public GrilledPineapple(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Grilled Pineapple";
    }


}
