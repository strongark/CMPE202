package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class RoastedCornBlackBeanSalsa extends ToppingDecorator {


    Burger burger;
    public RoastedCornBlackBeanSalsa(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Roasted Corn Black Bean Salsa";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
