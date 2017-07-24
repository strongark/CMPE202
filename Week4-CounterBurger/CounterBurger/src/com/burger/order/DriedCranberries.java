package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class DriedCranberries extends ToppingDecorator {

    public DriedCranberries(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Dried cranberries";
    }

}
