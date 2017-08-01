package com.sjsu.architects;

import java.util.ArrayList;

/**
 * Created by sneha on 7/31/17.
 */
public class FoodController {

    public void createFoodItems(Hotel hotel) {

        ArrayList<Food> fooditems = new ArrayList<>();
        Food egg = new Food();
        egg.setItemNumber(1);
        egg.setItemName("Egg");
        egg.setPrice(5);
        fooditems.add(egg);
        hotel.setFoodItems(fooditems);

    }

    public static void main(String[] argc) {
        Hotel hotel = new Hotel();
        FoodController controller = new FoodController();
        controller.createFoodItems(hotel);

        for (Food fooditems : hotel.getFoodItems()) {
            System.out.println(fooditems.getItemName());
        }
    }
}
