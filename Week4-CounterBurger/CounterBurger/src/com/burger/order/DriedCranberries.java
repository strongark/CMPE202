package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class DriedCranberries extends ToppingDecorator {


    Burger burger;
    public DriedCranberries(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Dried cranberries";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
