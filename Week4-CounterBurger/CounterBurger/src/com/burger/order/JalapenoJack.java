package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class JalapenoJack extends CheeseDecorator {


    Burger burger;
    public JalapenoJack(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Jalapeno Jack";
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
