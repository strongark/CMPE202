package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SauteedMushrooms extends ToppingDecorator {



    public SauteedMushrooms(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Sauteed Mushrooms";
    }

    @Override
    public double cost() {
        return 1.5 + burger.cost();
    }
}
