package com.sjsu.architects;

import java.util.ArrayList;

/**
 * Created by sneha on 7/30/17.
 */
public class Hotel {

    private String hotelName = null;
    private String location = null;
    private static ArrayList<Room> roomList = new ArrayList<>();
    private ArrayList<SpaService> serviceList = new ArrayList<>();
    private ArrayList<Food> foodItems = new ArrayList<>();


    public ArrayList<SpaService> getServiceList() {
        return serviceList;
    }

    public void setServiceList(ArrayList<SpaService> serviceList) {
        this.serviceList = serviceList;
    }

    public ArrayList<Food> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<Food> foodItems) {
        this.foodItems = foodItems;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static ArrayList<Room> getRoomList() {
        return roomList;
    }

    public static void setRoomList(ArrayList<Room> roomList) {
        Hotel.roomList = roomList;
    }


}
