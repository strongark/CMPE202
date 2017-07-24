package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ColeSlaw extends ToppingDecorator {


    Burger burger;
    public ColeSlaw(Burger burger){
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ",Cole Slaw ";
    }

    public double cost() {
        burger.toppingCount = burger.toppingCount - 1;
        if(burger.toppingCount < 0 ){
            return .75  + burger.cost();
        }else{
            return 0  + burger.cost();
        }
    }
}
