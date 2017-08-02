package com.sjsu.architects;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int iUserType = 0;
    private static Scanner scan;
    RoomBooking roomBookings = new RoomBooking();

    public static void main(String[] args) {

        // Creating Hotel

        Hotel hotel = new Hotel();
        hotel.setHotelName("Carton Hotel");
        hotel.setLocation("California");

        //Creating manager

        IdentityController identityController = IdentityController.getInstance();
        identityController.createSampleData();
        Manager manager = (Manager)identityController.getAccountById(1);

        // Creating SPA Service

        SpaServiceController servicecontroller = new SpaServiceController();
        servicecontroller.createServiceList(hotel);

        // Creating Food Items

        FoodController foodController = new FoodController();
        foodController.createFoodItems(hotel);

        // Creating Initial 20 Rooms each of Different Types (Single, Double, Deluxe and Suite) and Bed Types (Single, Double, Queen and King Bed)

        RoomController intializiningRooms = new RoomController();
        intializiningRooms.initializeRoom(hotel);

        do {

            System.out.println("Welcome to Carton Hotel ");
            System.out.println("1. Check For Room Availability | 2. Sign In  | 3. Sign Up  | 0. Exit ");
            scan = new Scanner(System.in);
            int iOperation = scan.nextInt();
            if (iOperation == 1) {
                MemberController memberOperations = new MemberController();
                memberOperations.checkRoomAvailablility();

            }
            else if (iOperation == 2) {

                do {
                    System.out.println(" Please Select the Account Type you want to Sign In as ");
                    System.out.println("   1. Manager   | 2. Staff   | 3. Carton Hotel Member | 0. Exit   ");
                    scan = new Scanner(System.in);
                    int UserType = scan.nextInt();
                    IdentityController login = IdentityController.getInstance();
                    if(UserType == 0){
                        break;
                    }
                    int userId = login.signIn();

                    if(userId != -1) {
                        if (UserType == 1) {
                            ManagerMenu(manager, hotel);
                        } else if (UserType == 2) {
                            StaffMenu();
                        } else if (UserType == 3) {
                            CustomerMenu(userId);
                        } else if (UserType == 0) {
                            break;
                        } else {
                            break;
                        }
                    }
                }
                while (1 != 0);

            }
            else if (iOperation == 3)
            {

                do {

                    System.out.println(" Please Enter The Account Type  1. Manager   | 2. Staff   | 3. Carton Hotel Member  ");
                    scan = new Scanner(System.in);
                    int UserType = scan.nextInt();
                    IdentityController signup = IdentityController.getInstance();
                    if (UserType == 1) {
                        int userId = signup.signUp(1);
                        ManagerMenu(manager,hotel);
                    } else if (UserType == 2) {
                        int userId =  signup.signUp(2);
                        StaffMenu();
                    } else if (UserType == 3) {
                        int userId = signup.signUp(3);
                        CustomerMenu(userId);
                    }
                    else if (UserType == 0){
                        break;
                    }
                    else
                    {
                        break;
                    }
                }
                while (1 != 0);

            }
            else if (iOperation == 0)
            {
                break;
            }
            else
            {
                break;
            }
        }while (1 !=0);

    }

    public static void ManagerMenu(Manager manager, Hotel hotel) {
        do {
            System.out.println("Welcome Manager ");
            System.out.println("1. Add Staff Member | 2. Delete Staff Member  | 3. Update Staff Member | 4. Add Room | 5. Delete Room | 6. Update Room | 7. Generate Promotion | 0. Exit ");
            scan = new Scanner(System.in);
            int iOperation = scan.nextInt();
            StaffController staffcontroller = new StaffController();
            RoomController roomcontroller = new RoomController();
            PromotionController promotionController = PromotionController.getInstance();
            if (iOperation == 1) {
                staffcontroller.createStaff(manager);

            } else if (iOperation == 2) {
                staffcontroller.deleteStaff(manager);

            } else if (iOperation == 3) {
                staffcontroller.updateStaff(manager);

            } else if (iOperation == 4){
                roomcontroller.createRoom(manager,hotel);

            }else if (iOperation == 5){
                roomcontroller.deleteRoom(manager,hotel);

            }else if (iOperation == 6){
                roomcontroller.updateRoom(manager,hotel);

            }else if (iOperation == 7){
              //  Member memberPromotion = new Member(promotionController);
                promotionController.createPromotion();

            }else if (iOperation == 0){
                break;
            }
            else {
                break;
            }

        } while (1 != 0);

    }

    /**
     *
     */
    public static void StaffMenu()
    {

        do {
            MemberController memberOperations = new MemberController();
            System.out.println("Welcome Staff Member ");
            System.out.println("1. Check For Room Availability | 2. Book Room  | " +
                    "3. Member Sign Up  | 4. Check In Customer | 5. Check Out Customer | " +
                    "6. Generate Bill | 7. Book Spa | 8. Order Food | 0. Exit ");
            scan = new Scanner(System.in);
            int iOperation = scan.nextInt();

            if (iOperation == 1) {
                memberOperations.checkRoomAvailablility();
            } else if (iOperation == 2) {
                System.out.println("Enter Member ID ");
                scan = new Scanner(System.in);
                int userID = scan.nextInt();

                IdentityController accountList = IdentityController.getInstance();
                Member member = (Member) accountList.getAccountById(userID);

                memberOperations.bookRoom(member);
            } else if (iOperation == 3) {

            } else if (iOperation == 4){

            }else if (iOperation == 5){

            }else if (iOperation == 6){
                System.out.println("Enter Booking ID ");
                scan = new Scanner(System.in);
                int bookingid = scan.nextInt();
                memberOperations.viewBookings(bookingid);
            }else if (iOperation == 7){
                System.out.println("Enter Booking ID ");
                scan = new Scanner(System.in);
                int bookingid = scan.nextInt();

                SpaServiceController spa = new SpaServiceController();
                spa.bookSpaServices(bookingid);

            }else if (iOperation == 8){
                System.out.println("Enter Booking ID ");
                scan = new Scanner(System.in);
                int bookingid = scan.nextInt();

                FoodController food = new FoodController();
                food.orderFood(bookingid);
            }else if (iOperation == 0){
                break;
            }
            else {
                break;
            }

        } while (1 != 0);


    }

    /**
     *
     * @param userId
     */
    public static void CustomerMenu(int userId)
    {

        IdentityController accountList = IdentityController.getInstance();
        Member member = (Member) accountList.getAccountById(userId);

        do {
            System.out.println("Welcome Carton Hotel Member ");
            System.out.println("1. Check For Room Availability | 2. Book Room  | 3. Delete Room  | 4. View Booking  | 0. Exit ");
            scan = new Scanner(System.in);
            int iOperation = scan.nextInt();

            MemberController memberOperations = new MemberController();
            if (iOperation == 1) {
                memberOperations.checkRoomAvailablility();
            } else if (iOperation == 2) {
                memberOperations.bookRoom(member);

            } else if (iOperation == 3) {

            } else if (iOperation == 4){
                System.out.println("Enter Booking ID: ");
                scan = new Scanner(System.in);
                int id = scan.nextInt();

                memberOperations.viewRoomBookings(id);
            } else if (iOperation == 0){
                break;
            }
            else {
                break;
            }

        } while (1 != 0);

    }

}
