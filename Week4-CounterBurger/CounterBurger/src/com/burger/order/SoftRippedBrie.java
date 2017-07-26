package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SoftRippedBrie extends CheeseDecorator {


    public SoftRippedBrie(Burger burger){
        super(burger);
    }


    @Override
    public String getDescription() {
        return burger.getDescription() + ",Soft Ripped Brie ";
    }


}
