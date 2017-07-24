package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class BlackOlives extends ToppingDecorator {


    Burger burger;
    public BlackOlives(Burger burger){
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Black Olives ";
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
