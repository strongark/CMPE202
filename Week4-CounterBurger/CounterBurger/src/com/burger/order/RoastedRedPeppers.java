package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class RoastedRedPeppers extends ToppingDecorator {



    public RoastedRedPeppers(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Roasted Red Peppers ";
    }


}
