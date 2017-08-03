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

    public static ArrayList<RoomBooking> getUnpaidBookingOfMember(int memberId){
        ArrayList<RoomBooking> memberRoomBookingList= new ArrayList<RoomBooking>();
        for (MemberBookingProxy booking:memberRoomBookings.values()){
            RoomBooking roomBooking = (RoomBooking)booking.bookings();
            if(roomBooking.getMember().getId()==memberId && !roomBooking.isPaid())
                memberRoomBookingList.add(roomBooking);
        }
        return memberRoomBookingList;
    }

    public static RoomBooking getUnpaidRoomBooking(int roomNumber){

        for (MemberBookingProxy booking:memberRoomBookings.values()){
            RoomBooking roomBooking = (RoomBooking)booking.bookings();
            for(Room room:roomBooking.getBookedRooms())
                if (room.getRoomNumber()==roomNumber)
                    return roomBooking;
        }
        return null;
    }

    @Override
    public void paid() {
        Booking booking= memberRoomBookings.get(getBookingID()).bookings();
        booking.isPaid=true;
    }

    @Override
    public double cost() {
        double totalCost=0;
        for (Room room:getBookedRooms()){
            totalCost+=room.getRoomPrice();
        }
        return totalCost;
    }
}
