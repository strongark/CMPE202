package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class TillamookCheddar extends CheeseDecorator {

    public TillamookCheddar(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Tillamook Cheddar ";
    }

}
