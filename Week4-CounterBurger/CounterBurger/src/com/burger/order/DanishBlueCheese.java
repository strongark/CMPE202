package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class DanishBlueCheese extends CheeseDecorator {


    Burger burger;
    public DanishBlueCheese(Burger burger){
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Danish Blue Cheese";
    }

    public double cost() {
        burger.cheeseCount = burger.cheeseCount - 1;
        if(burger.cheeseCount < 0 ){
            return 1 + burger.cost();
        }else{
            return 0  + burger.cost();
        }

    }
}
