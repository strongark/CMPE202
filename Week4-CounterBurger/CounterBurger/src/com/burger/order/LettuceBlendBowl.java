package com.burger.order;

/**
 * Created by tranpham on 7/24/17.
 */
public class LettuceBlendBowl extends InABowlServe {
    public LettuceBlendBowl(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Serve in A Bowl with Lettuce Blend";
    }

}
