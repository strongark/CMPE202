package com.sjsu.architects;

import java.util.ArrayList;
import java.util.HashMap;

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

    public void orderFood(int bookingID){
        HashMap<Integer, MemberBookingProxy> memberBooking = RoomBooking.getMemberRoomBookings();
        MemberBookingProxy member = memberBooking.get(bookingID);

        Food food = new Food();
        food.setItemName("Egg");
        food.setPrice(5);
        food.setItemNumber(1);

        ArrayList<Food> FooServices = new ArrayList<>();
        FooServices.add(food);


        FoodBooking booking = new FoodBooking();
        booking.foodList(FooServices);
        booking.setMember(member.bookings().getMember());


        for (Food foodsrv:FooServices)
            booking.appendDescription(foodsrv.getItemName());


        HashMap<Integer, FoodBooking> foodBookingHashMap = new HashMap<>();
        foodBookingHashMap.put(bookingID, booking);
        FoodBooking.setFoodOrders(foodBookingHashMap);

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
