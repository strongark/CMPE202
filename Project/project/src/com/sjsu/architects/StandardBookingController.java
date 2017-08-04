package com.sjsu.architects;

import java.util.Date;


/**
 * Actual implementation of Booking
 */
public class StandardBookingController {

    Booking booking = new Booking();

    /**
     * Constructor
     */
    public StandardBookingController( ){
        Member member = new Member();
        member.setEmail_address("");
        member.setName("");

        booking.setBookingID();
        booking.setDateOfBooking(new Date("9999/07/31"));
        booking.setMember(member);
        this.booking = booking;
    }

    public void bookRoom(Booking booking){
        this.booking = booking;
    }

    public void bookSpaService(Booking booking){
        this.booking = booking;
    }

    public void bookFoodService(Booking booking){
        this.booking = booking;
    }


    public Booking getSpaService(){
        return booking;
    }

    public Booking getFoodService(){
        return booking;
    }

    public Booking getRoomBookings(){
        return booking;
    }

}

