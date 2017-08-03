package com.sjsu.architects;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class MemberController {

    public MemberController(){

    }

    /**
     * Check Room availability
     */
    public void checkRoomAvailablility(){
        int totalAvailable = 0;
        int singleRoom = 0;
        int doubleRoom = 0;
        int deluxeRoom = 0;
        int suite = 0;

        //Actual list of rooms
        ArrayList<Room> roomAvailability = Hotel.getRoomList();
        int size = roomAvailability.size();

        if(size > 0) {
                for (Room ifRoomAvailable : roomAvailability) {
                    if (ifRoomAvailable.isRoomAvailable()) {
                        if(ifRoomAvailable.getRoomType().equals("Single Room")){
                            singleRoom++;
                        } else if(ifRoomAvailable.getRoomType().equals("Double Room")){
                            doubleRoom++;
                        } else if(ifRoomAvailable.getRoomType().equals("Deluxe Room")){
                            deluxeRoom++;
                        } else if(ifRoomAvailable.getRoomType().equals("Suite")){
                            suite++;
                        }
                        totalAvailable++;
                    }

                }

        }
        System.out.println("Total " + totalAvailable);
        System.out.println("-------------------------------------------------");
        System.out.println("Single " + singleRoom);
        System.out.println("Double " + doubleRoom);
        System.out.println("Deluxe " + deluxeRoom);
        System.out.println("Suite " + suite);
    }


    /**
     * Book a room for member
     * @param member
     * @return
     */
    public void bookRoom(Member member){

        MemberBookingProxy bookingProxy = new MemberBookingProxy();

        Room room = new Room();

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter Room Type : 1. Single Room | 2. Double Room | 3. Deluxe Room | 4. Suite ");
        scanner = new Scanner(System.in);
        int UserType = scanner.nextInt();

        if (UserType == 1) {
            room.setRoomType("Single Room");

        } else if (UserType == 2) {
            room.setRoomType("Double Room");
        } else if (UserType == 3) {

            room.setRoomType("Deluxe Room");
        } else if (UserType == 4) {

            room.setRoomType("Suite");
        }
        else {
            room.setRoomType("N/A");
        }

        System.out.println(" Please Enter Number of Rooms ");
        scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(" Please Enter Start Date of Booking (format : yyyy/mm/dd)");
        scanner = new Scanner(System.in);
        Date startDate = new Date(scanner.nextLine());

        System.out.println(" Please Enter End Date of Booking (format : yyyy/mm/dd)");
        scanner = new Scanner(System.in);
        Date endDate = new Date(scanner.nextLine());

        //Actual list of rooms
        ArrayList<Room> roomAvailability = Hotel.getRoomList();

        //Number of rooms for customers
        ArrayList<Room> roomBookings = new ArrayList<>();

        int size = roomAvailability.size();

        if(size > number){
            RoomBooking booking = new RoomBooking();

            for(int i = 0 ; i< number ; i++) {
                for(Room ifRoomAvailable : roomAvailability){
                    if(ifRoomAvailable.isRoomAvailable() && ifRoomAvailable.getRoomType().equals(room.getRoomType())) {
                        ifRoomAvailable.setRoomAvailable(false);
                        roomBookings.add(ifRoomAvailable);

                        booking.appendDescription("\nRoom "+ifRoomAvailable.getRoomNumber());
                        booking.appendDescription(ifRoomAvailable.getRoomType());
                        booking.appendDescription(ifRoomAvailable.getBedType());
                        break;
                    }
                }
            }
            booking.setDateOfBooking(startDate);
            booking.setEndDateOfBooking(endDate);
            booking.setBookingID();
            booking.setMember(member);
            booking.setBookRoom(roomBookings);

            bookingProxy.book(booking);

            HashMap<Integer, MemberBookingProxy> list = new HashMap<>();
            list.put(booking.getBookingID(), bookingProxy);
            RoomBooking.setMemberRoomBookings(list);
            System.out.println("Your booking is confirmed. Please note down the booking ID for future reference :" + bookingProxy.bookings().getBookingID());
        } else {
            System.err.println(number + " Rooms are not available");
        }

    }

    /**
     * For customer view
     */
    public void viewRoomBookings(int bookingID){
        HashMap<Integer, MemberBookingProxy> bookings = RoomBooking.getMemberRoomBookings();
        MemberBookingProxy bookingOfMember = bookings.get(bookingID);

        RoomBooking roomBooking = (RoomBooking) bookingOfMember.bookings();

        System.out.println("Booking ID " + roomBooking.getBookingID() + " for Member : " + roomBooking.getMember().getUsername() +
                "\n No of Rooms" + roomBooking.getBookedRooms().size() );

        for(Room room : roomBooking.getBookedRooms() ){
            System.out.println(room.getRoomType() + " " + room.getRoomPrice());
        }

    }

    /**
     * For Staff View
     */
    public void viewBookings(int bookingID){

        viewRoomBookings(bookingID);

        HashMap<Integer, SpaBooking> spaBooking = SpaBooking.getSpaService();
        SpaBooking booking = spaBooking.get(bookingID);
        if(booking != null) {
            for (SpaService spa : booking.getSpaServices()) {
                System.out.println(spa.getServiceName() + " " + spa.getPrice());
            }
        }

        HashMap<Integer, FoodBooking> foodBooking = FoodBooking.getFoodOrders();
        FoodBooking foodList = foodBooking.get(bookingID);
        if(foodList != null) {
            for (Food food : foodList.getFoodItems()) {
                System.out.println(food.getItemName() + " " + food.getPrice());
            }
        }

    }

}
