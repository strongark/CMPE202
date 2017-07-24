package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Gruyere extends CheeseDecorator {


    Burger burger;
    public Gruyere(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Gruyere ";
    }

}
