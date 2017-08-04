package com.sjsu.architects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by sneha on 7/31/17.
 */
public class FoodController {

    /**
     * Order Food
     * @param bookingID
     */
    public void orderFood(int bookingID){
        HashMap<Integer, MemberBookingProxy> memberBooking = RoomBooking.getMemberRoomBookings();
        MemberBookingProxy member = memberBooking.get(bookingID);

        if(member !=null) {
            ArrayList<Food> foodItems = Hotel.getFoodItems();
            ArrayList<Food> selectedFood = new ArrayList<>();
            int UserType = -1;
            do {

                for (int i = 0; i < foodItems.size(); i++) {
                    System.out.println(foodItems.get(i).getItemNumber() + ". " + foodItems.get(i).getItemName() + " " + foodItems.get(i).getPrice());
                }
                System.out.println("0. Exit");
                UserType = Bootstrap.handleUserInput();

                if (UserType != 0) {
                    Food service = foodItems.get((UserType - 1));
                    selectedFood.add(foodItems.get(UserType));
                    selectedFood.add(service);
                    System.out.println("Customer " + member.bookings().getMember().getName() + " requested " + service.getItemName());

                } else if (UserType == 0) {
                    break;
                } else {
                    break;
                }
            }
            while (1 != 0);

            FoodBooking booking = new FoodBooking();
            booking.foodList(selectedFood);
            booking.setMember(member.bookings().getMember());


            for (Food foodsrv : selectedFood)
                booking.appendDescription(foodsrv.getItemName());

            HashMap<Integer, FoodBooking> foodBookingHashMap = new HashMap<>();
            foodBookingHashMap.put(bookingID, booking);
            FoodBooking.setFoodOrders(foodBookingHashMap);
        } else {
            System.out.println("No booking found");
        }

    }

    public static void main(String[] args){

    }
}
