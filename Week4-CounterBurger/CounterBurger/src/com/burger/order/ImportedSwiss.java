package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ImportedSwiss extends CheeseDecorator {

    public ImportedSwiss(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Imported Swiss";
    }

}
