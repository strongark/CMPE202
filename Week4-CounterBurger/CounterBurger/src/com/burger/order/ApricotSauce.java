package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ApricotSauce extends SauceDecorator {


    Burger burger;
    public ApricotSauce(Burger burger){
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Apricot Sauce";
    }

    public double cost() {
        burger.sauceCount = burger.sauceCount - 1;
        if(burger.sauceCount < 0 ){
            return 0.75 + burger.cost();
        }else{
            return 0 + burger.cost();
        }
    }
}
