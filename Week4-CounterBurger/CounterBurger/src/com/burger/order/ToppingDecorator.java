package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public abstract class ToppingDecorator extends Burger {

    Burger burger;

    public abstract String getDescription();

    public ToppingDecorator(Burger burger)
    {
        this.burger=burger;
        super.toppingCount=burger.toppingCount+1;
    }
    @Override
    public double cost() {

        if(burger.toppingCount > 4 ){
            return .75  + burger.cost();
        }else{
            return 0  + burger.cost();
        }
    }

}
