package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public abstract class CheeseDecorator extends Burger {

    Burger burger;

    public CheeseDecorator(Burger burger){
        this.burger = burger;
        super.cheeseCount=burger.cheeseCount+1;
    }

    public abstract String getDescription();

    @Override
    public double cost() {
        if(super.cheeseCount > 1 ){
            return 1 + burger.cost();
        }else{
            return 0  + burger.cost();
        }

    }
}
