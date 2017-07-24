package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SoftRippedBrie extends CheeseDecorator {


    Burger burger;
    public SoftRippedBrie(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Soft Ripped Brie ";
    }

    @Override
    public double cost() {
        burger.cheeseCount = burger.cheeseCount - 1;
        if(burger.cheeseCount < 0 ){
            return 1 + burger.cost();
        }else{
            return 0 + burger.cost();
        }
    }
}
