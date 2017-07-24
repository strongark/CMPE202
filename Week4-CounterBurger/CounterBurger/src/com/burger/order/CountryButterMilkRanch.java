package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class CountryButterMilkRanch extends SauceDecorator {


    Burger burger;
    public CountryButterMilkRanch(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Country Butter Milk Ranch";
    }

    @Override
    public double cost() {
        burger.sauceCount = burger.sauceCount - 1;
        if(burger.sauceCount < 0 ){
            return .75  + burger.cost();
        }else{
            return 0  + burger.cost();
        }
    }
}
