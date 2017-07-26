package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class DijonBalsamicDressing extends SauceDecorator {

    public DijonBalsamicDressing(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ",Dijon Balsamic Dressing ";
    }

}
