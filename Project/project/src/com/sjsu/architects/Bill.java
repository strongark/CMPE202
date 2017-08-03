package com.sjsu.architects;

import java.util.*;

/**
 * Created by sneha on 7/30/17.
 */
public class Bill {

    private int billID;

    private static int identity=1;
    ArrayList<Booking> bookingArrayList = new ArrayList<Booking>();
    PaymentStrategy payment;
    boolean isPaid=false;

    public Bill(){
        billID=identity++;
    }

    public int getBillID() {
        return billID;
    }

    public double getTotalCost(){
        double result=0;
        for (Booking booking:bookingArrayList){
            result+=booking.cost();
        }
        return result;
    }

    public void printBillDetail(){
        double result=0;
        System.out.println("Bill No: "+billID);
        System.out.println("====================================================");
        for (Booking booking:bookingArrayList){
            double bookingCost=booking.cost();
            System.out.printf("%-40s%2f%n",booking.getDescription(),bookingCost);
            result+=bookingCost;
        }
        System.out.println("====================================================");
        System.out.printf("%-40s%2f%n","Total",result);
    }

    public void pay(PaymentStrategy paymentStrategy){
        this.payment=paymentStrategy;
        isPaid=true;
        for (Booking booking:bookingArrayList){
            booking.paid();
        }
    }

    public void addBooking(Booking booking){
        bookingArrayList.add(booking);
    }
    public void addBooking(ArrayList<Booking> booking){
        bookingArrayList.addAll(booking);
    }
}
