package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class DanishBlueCheese extends CheeseDecorator {


    public DanishBlueCheese(Burger burger){
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + ", Danish Blue Cheese";
    }
}
