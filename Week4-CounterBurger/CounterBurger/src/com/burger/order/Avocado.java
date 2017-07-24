package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class Avocado extends ToppingDecorator {


    Burger burger;
    public Avocado(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Avocado";
    }

    @Override
    public double cost() {
        return 1.5  + burger.cost();
    }
}
