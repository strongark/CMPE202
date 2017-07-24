package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class OnABunServe extends ServeDecorator {


    Burger burger;
    public OnABunServe(Burger burger){
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", On A Bun";
    }

    public double cost() {
        return burger.cost() + 0;
    }
}
