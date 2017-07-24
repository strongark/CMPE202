package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class LettuceBlend extends ToppingDecorator {

    public LettuceBlend(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Lettuce Blend ";
    }

}
