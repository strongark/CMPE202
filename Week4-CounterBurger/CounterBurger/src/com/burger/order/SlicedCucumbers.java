package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SlicedCucumbers extends ToppingDecorator {


    Burger burger;
    public SlicedCucumbers(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Sliced Cucumbers";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
