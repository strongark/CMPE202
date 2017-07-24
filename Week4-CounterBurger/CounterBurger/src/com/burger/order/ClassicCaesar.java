package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ClassicCaesar extends SauceDecorator {

    public ClassicCaesar(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Classic Caesar ";
    }

}
