package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class GingerSoyGlaze extends SauceDecorator {

    public GingerSoyGlaze(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Ginger Soy Glaze ";
    }

}
