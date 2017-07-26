package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class BermudaRedOnion extends ToppingDecorator {



    public BermudaRedOnion(Burger burger){
        super(burger);    }

    public String getDescription() {
        return burger.getDescription() + ",Bermuda Red Onion ";
    }

}
