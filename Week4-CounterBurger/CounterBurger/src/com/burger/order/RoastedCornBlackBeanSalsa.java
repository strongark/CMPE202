package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class RoastedCornBlackBeanSalsa extends ToppingDecorator {

    public RoastedCornBlackBeanSalsa(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Roasted Corn Black Bean Salsa";
    }
}
