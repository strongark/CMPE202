package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class CountryButterMilkRanch extends SauceDecorator {


    public CountryButterMilkRanch(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Country Butter Milk Ranch";
    }

}
