package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class SunDriedTomatoVinaigrette extends SauceDecorator {


    Burger burger;
    public SunDriedTomatoVinaigrette(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Sun Dried Vinaigrette";
    }

    @Override
    public double cost() {
        burger.sauceCount = burger.sauceCount - 1;
        if(burger.sauceCount < 0 ){
            return .75 + burger.cost();
        }else{
            return 0 + burger.cost();
        }
    }
}
