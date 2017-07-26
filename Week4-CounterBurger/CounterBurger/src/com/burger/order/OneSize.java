package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class OneSize extends SizeDecorator {

    Burger burger;
    public OneSize(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() { return burger.getDescription() + ", 1lb";}

    @Override
    public double cost() {
        return 15.50 + burger.cost();
    }
}
