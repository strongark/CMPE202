package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public abstract class SauceDecorator extends Burger {

    Burger burger;
    public SauceDecorator(Burger burger){
        this.burger=burger;
        super.sauceCount++;
    }

    public abstract String getDescription();

    @Override
    public double cost() {
        if(super.sauceCount>1)
            return burger.cost()+0.75;
        else
            return burger.cost();
    }
}
