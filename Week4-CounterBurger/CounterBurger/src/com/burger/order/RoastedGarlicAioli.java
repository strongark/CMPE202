package com.burger.order;

/**
 * Created by sneha on 7/23/17.
 */
public class RoastedGarlicAioli extends SauceDecorator {

    public RoastedGarlicAioli(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Roasted Garlic Aioli";
    }

}
