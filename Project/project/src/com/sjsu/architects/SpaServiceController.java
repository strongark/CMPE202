package com.sjsu.architects;

import java.util.ArrayList;

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

    public static void main(String[] argc) {
        Hotel hotel = new Hotel();
        SpaServiceController servicecontroller = new SpaServiceController();
        servicecontroller.createServiceList(hotel);

        for (SpaService spaService : hotel.getServiceList()) {
            System.out.println(spaService.getServiceName());
        }
    }
}