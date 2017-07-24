package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class GrilledOnions extends ToppingDecorator {

    public GrilledOnions(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Grilled Onions ";
    }

}
