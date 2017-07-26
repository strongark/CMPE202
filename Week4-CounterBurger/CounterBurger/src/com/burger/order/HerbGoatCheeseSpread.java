package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class HerbGoatCheeseSpread extends CheeseDecorator{



    public HerbGoatCheeseSpread(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Herb Goat Cheese";
    }

}
