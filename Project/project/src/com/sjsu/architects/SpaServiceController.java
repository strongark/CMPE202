package com.sjsu.architects;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by sneha on 7/31/17.
 */
public class SpaServiceController {

    public void createServiceList(Hotel hotel) {
        ArrayList<SpaService> spaServices = new ArrayList<>();

        SpaService massage = new SpaService();
        massage.setServiceName("Massage Service");
        massage.setPrice(100);
        massage.setServiceNumber(1);
        spaServices.add(massage);
        hotel.setServiceList(spaServices);
    }

    public void bookSpaServices(int bookingID){

        HashMap<Integer, MemberBookingProxy> memberBooking = RoomBooking.getMemberRoomBookings();
        MemberBookingProxy member = memberBooking.get(bookingID);

        SpaService massage = new SpaService();
        massage.setServiceName("Massage Service");
        massage.setPrice(100);
        massage.setServiceNumber(1);

        ArrayList<SpaService> spaServices = new ArrayList<>();
        spaServices.add(massage);


        SpaBooking booking = new SpaBooking();
        booking.setSpaServices(spaServices);
        booking.setMember(member.bookings().getMember());
        for (SpaService spaService:spaServices)
            booking.appendDescription(spaService.getServiceName());

        //booking.setDateOfBooking("");//TODO need to set date

        HashMap<Integer, SpaBooking> spaBookingHashMap = new HashMap<>();
        spaBookingHashMap.put(bookingID, booking);
        SpaBooking.setSpaService(spaBookingHashMap);

    }

    public static void main(String[] argc) {
        Hotel hotel = new Hotel();
        SpaServiceController servicecontroller = new SpaServiceController();
        servicecontroller.createServiceList(hotel);

        for (SpaService spaService : hotel.getServiceList()) {
            System.out.println(spaService.getServiceName());
        }
    }
}