package com.sjsu.architects;

import java.util.ArrayList;
import java.util.HashMap;

public class FoodBooking extends Booking{
    private static HashMap<Integer , FoodBooking> foodOrders = new HashMap<Integer, FoodBooking>();

    ArrayList<Food> food = new ArrayList<>();

    public ArrayList<Food> getFoodItems() {
        return food;
    }

    public void foodList(ArrayList<Food> food) {
        this.food = food;
    }

    public static HashMap<Integer, FoodBooking> getFoodOrders() {
        return foodOrders;
    }

    public static void setFoodOrders(HashMap<Integer, FoodBooking> foodOrders) {
        FoodBooking.foodOrders = foodOrders;
    }
}
