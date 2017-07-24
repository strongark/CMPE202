package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class FriedEgg extends ToppingDecorator {

    public FriedEgg(Burger burger){
        super(burger);
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
