package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class BermudaRedOnion extends ToppingDecorator {


    Burger burger;
    public BermudaRedOnion(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Bermuda Red Onion ";
    }

    @Override
    public double cost() {
        return burger.cost() + 9.50;
    }
}
