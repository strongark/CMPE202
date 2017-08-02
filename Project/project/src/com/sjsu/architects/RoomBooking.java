package com.sjsu.architects;

import java.util.ArrayList;
import java.util.HashMap;

public class RoomBooking extends Booking  {

    ArrayList<Room> bookRoom = new ArrayList<>();
    private static HashMap<Integer , MemberBookingProxy> memberRoomBookings = new HashMap<Integer, MemberBookingProxy>();

    public ArrayList<Room> getBookedRooms() {
        return bookRoom;
    }

    public void setBookRoom(ArrayList<Room> bookRoom) {
        this.bookRoom = bookRoom;
    }

    public boolean checkin(){
        return true;
    }


    public boolean checkout(){
        return true;
    }


    public static HashMap<Integer, MemberBookingProxy> getMemberRoomBookings() {
        return memberRoomBookings;
    }

    public static void setMemberRoomBookings(HashMap<Integer, MemberBookingProxy> memberRoomBookings) {
        RoomBooking.memberRoomBookings = memberRoomBookings;
    }

}
