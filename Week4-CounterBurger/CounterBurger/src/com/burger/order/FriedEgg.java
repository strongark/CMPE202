package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class FriedEgg extends ToppingDecorator {


    Burger burger;
    public FriedEgg(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Fried Egg ";
    }

    @Override
    public double cost() {
        return 1.5  + burger.cost();
    }
}
