package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class BermudaRedOnion extends ToppingDecorator {


    Burger burger;
    public BermudaRedOnion(Burger burger){
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ",Bermuda Red Onion ";
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
