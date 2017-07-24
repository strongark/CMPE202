package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class LettuceBlend extends ToppingDecorator {


    Burger burger;
    public LettuceBlend(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Lettuce Blend ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
