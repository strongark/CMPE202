package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ColeSlaw extends ToppingDecorator {

    public ColeSlaw(Burger burger){
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + ",Cole Slaw ";
    }

}
