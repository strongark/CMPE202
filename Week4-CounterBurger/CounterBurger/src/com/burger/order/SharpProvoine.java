package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SharpProvoine extends CheeseDecorator {



    public SharpProvoine(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Sharp Provoine";
    }

}
