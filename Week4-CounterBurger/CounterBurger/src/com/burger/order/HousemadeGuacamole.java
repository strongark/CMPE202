package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class HousemadeGuacamole extends ToppingDecorator {


    Burger burger;
    public HousemadeGuacamole(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",House Made Guacamole ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
