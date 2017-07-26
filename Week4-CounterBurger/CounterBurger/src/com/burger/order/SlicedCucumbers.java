package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SlicedCucumbers extends ToppingDecorator {

    public SlicedCucumbers(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Sliced Cucumbers";
    }

}
