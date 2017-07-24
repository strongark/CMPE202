package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public abstract class ToppingDecorator extends Burger {

    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
