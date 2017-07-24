package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class HerbGoatCheeseSpread extends CheeseDecorator{


    Burger burger;
    public HerbGoatCheeseSpread(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Herb Goat Cheese";
    }

    @Override
    public double cost() {
        burger.cheeseCount = burger.cheeseCount - 1;
        if(burger.cheeseCount < 0 ){
            return 1  + burger.cost();
        }else{
            return 0  + burger.cost();
        }
    }
}
