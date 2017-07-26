package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SunDriedTomatoVinaigrette extends SauceDecorator {



    public SunDriedTomatoVinaigrette(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Sun Dried Vinaigrette";
    }

}
