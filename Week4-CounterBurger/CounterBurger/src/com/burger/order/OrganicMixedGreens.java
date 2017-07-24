package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class OrganicMixedGreens extends ToppingDecorator {


    Burger burger;
    public OrganicMixedGreens(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Organic Mixed Greens";
    }

    @Override
    public double cost() {
        burger.toppingCount = burger.toppingCount - 1;
        if(burger.toppingCount < 0 ){
            return .75 + burger.cost();
        }else{
            return 0 + burger.cost();
        }
    }
}
