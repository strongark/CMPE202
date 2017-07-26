package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class HousemadeGuacamole extends ToppingDecorator {

    public HousemadeGuacamole(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",House Made Guacamole ";
    }

    @Override
    public double cost() {
        return 1.5  + burger.cost();
    }
}
