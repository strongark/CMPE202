package com.sjsu.architects;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tranpham on 8/1/17.
 */
public class BillController {

    static ArrayList<Bill> billArrayList = new ArrayList<Bill>();


    public Bill createBill(Member member){
        Bill bill = new Bill();

        for(RoomBooking booking:RoomBooking.getUnpaidBookingOfMember(member.getId())){
            bill.addBooking(booking);
        }

        for(FoodBooking booking:FoodBooking.getUnpaidBookingOfMember(member.getId())){
            bill.addBooking(booking);
        }

        for(SpaBooking booking:SpaBooking.getUnpaidBookingOfMember(member.getId())){
            bill.addBooking(booking);
        }

        billArrayList.add(bill);

        return bill;
    }

    public void viewUnpaidBookingOfMember(Member member){
        double totalCost=0;
        for(Booking booking:RoomBooking.getUnpaidBookingOfMember(member.getId())){
            double bookingCost=booking.cost();
            System.out.printf("%30s%5f%n",booking.getDescription(),bookingCost);
            totalCost+=bookingCost;
        }

        for(FoodBooking booking:FoodBooking.getUnpaidBookingOfMember(member.getId())){
            double bookingCost=booking.cost();
            System.out.printf("%30s%5f%n",booking.getDescription(),bookingCost);
            totalCost+=bookingCost;
        }

        for(SpaBooking booking:SpaBooking.getUnpaidBookingOfMember(member.getId())){
            double bookingCost=booking.cost();
            System.out.printf("%30s%5f%n",booking.getDescription(),bookingCost);
            totalCost+=bookingCost;
        }
        System.out.printf("%30s%5f%n","Total",totalCost);
    }

    public void payBill(int billId){

        Bill bill = getBillById(billId);
        if(bill!=null){

            bill.pay(new CashPaymentStrategy());
        }
        else
            System.out.println("Bill not found!");
    }

    public void run(){
        boolean exit=false;
        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("Bill & Payment ");
            System.out.println("1. View unpaid booking | 2. Generate Bill | 3. Pay Bill | 0. Exit");
            scan = new Scanner(System.in);
            int iOperation = scan.nextInt();

            switch (iOperation){
                case 1:
                    System.out.println("Enter Member ID: ");
                    scan = new Scanner(System.in);
                    int userID = scan.nextInt();
                    IdentityController accountList = IdentityController.getInstance();
                    Member member = (Member) accountList.getAccountById(userID);
                    if(member!=null){
                        viewUnpaidBookingOfMember(member);
                    }
                    break;
                case 2:
                    System.out.println("Enter Member ID: ");
                    scan = new Scanner(System.in);
                    userID = scan.nextInt();
                    member = (Member) IdentityController.getInstance().getAccountById(userID);
                    if(member!=null){
                        Bill bill=createBill(member);
                        bill.printBillDetail();
                    }
                    break;

                case 3:
                    System.out.println("Enter Bill No: ");
                    scan = new Scanner(System.in);
                    int billId = scan.nextInt();
                    Bill bill = getBillById(billId);
                    if(bill!=null){
                        bill.printBillDetail();
                        System.out.println("Enter Payment Option: ");
                        System.out.println("1. Cash | 2. Check | 3. Credit Card | 0. Exit");
                        scan = new Scanner(System.in);
                        int iPaymentOption = scan.nextInt();
                        switch (iPaymentOption){
                            case 1:
                                bill.pay(new CashPaymentStrategy());
                                break;
                            case 2:
                                bill.pay(new CheckPaymentStrategy());
                                break;
                            case 3:
                                String name="";
                                String cardNumber="";
                                String cvv="";
                                String dateOfExpiry="";
                                bill.pay(new CreditCardPaymentStrategy(name,cardNumber,cvv,dateOfExpiry));
                                break;
                        }
                    }
                    break;

                default:
                    break;
            }

        }while (!exit);
    }
    public Bill getBillById(int billId){
        for(Bill bill:billArrayList){
            if(bill.getBillID()==billId)
                return bill;
        }
        return null;
    }
}