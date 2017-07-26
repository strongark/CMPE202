package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class OrganicMixedGreens extends ToppingDecorator {

    public OrganicMixedGreens(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Organic Mixed Greens";
    }

}
