package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class ChipotleAioli extends SauceDecorator {

    public ChipotleAioli(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Chipotle Aioli";
    }

}
