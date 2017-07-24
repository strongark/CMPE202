package com.burger.order;

/**
 * Created by tranpham on 7/24/17.
 */
public class OrganicMixedGreensBowl extends InABowlServe {
    public OrganicMixedGreensBowl(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Serve in A Bowl with Organic Mixed Greens";
    }
}
