package com.sjsu.architects;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by sneha on 7/31/17.
 */
public class SpaServiceController {

    /**
     * Book Spa Service
     * @param bookingID
     */
    public void bookSpaServices(int bookingID){

        HashMap<Integer, MemberBookingProxy> spaBooking = RoomBooking.getMemberRoomBookings();
        MemberBookingProxy member = spaBooking.get(bookingID);

        if(member !=null) {
            ArrayList<SpaService> spaItems = Hotel.getServiceList();
            ArrayList<SpaService> selectedSpaService = new ArrayList<>();
            int UserType = -1;

            do {

                for (int i = 0; i < spaItems.size(); i++) {
                    System.out.println(spaItems.get(i).getServiceNumber() + ". " + spaItems.get(i).getServiceName() + " " + spaItems.get(i).getPrice());
                }
                System.out.println("0. Exit");

                UserType = Bootstrap.handleUserInput();
                if (UserType != 0) {
                    SpaService service = spaItems.get((UserType - 1));
                    selectedSpaService.add(service);
                    System.out.println("Customer " + member.bookings().getMember().getName() + " requested " + service.getServiceName());

                } else if (UserType == 0) {
                    break;
                } else {
                    break;
                }
            }
            while (1 != 0);


            SpaBooking booking = new SpaBooking();
            booking.setSpaServices(selectedSpaService);
            booking.setMember(member.bookings().getMember());

            for (SpaService spaService : selectedSpaService)
                booking.appendDescription(spaService.getServiceName());

            HashMap<Integer, SpaBooking> spaBookingHashMap = new HashMap<>();
            spaBookingHashMap.put(bookingID, booking);
            SpaBooking.setSpaService(spaBookingHashMap);
        } else {
            System.out.println("No Booking found");
        }

    }


    public static void main(String[] args){
        int UserType = -1;

        do {

            System.out.println("1");

            UserType = Bootstrap.handleUserInput();
            if (UserType != 0){
                //TODO
            }
            else if(UserType==0)
            {
                break;
            } else {
                break;
            }
        }
        while (1 != 0);
    }
}