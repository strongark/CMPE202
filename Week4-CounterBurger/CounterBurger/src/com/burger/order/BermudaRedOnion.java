package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class BermudaRedOnion extends ToppingDecorator {


    Burger burger;
    public BermudaRedOnion(Burger burger){
        this.burger = burger;
        super.toppingCount = burger.toppingCount + 1;
    }

    public String getDescription() {
        return burger.getDescription() + ",Bermuda Red Onion ";
    }

    public double cost() {

        if(burger.toppingCount > 4 ){
            return .75  + burger.cost();
        }else{
            return 0  + burger.cost();
        }
    }
}
