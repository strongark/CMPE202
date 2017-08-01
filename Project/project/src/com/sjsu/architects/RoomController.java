package com.sjsu.architects;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sneha on 7/31/17.
 */
public class RoomController {

    public void createRoom(Manager manager, Hotel hotel){

        ArrayList<Room> roomlist = hotel.getRoomList();
        Room room = new Room();

        System.out.println("Enter Room No.");
        Scanner scan = new Scanner(System.in);
        int roomNo = scan.nextInt();
        for (Room roomsearch : hotel.getRoomList())
        {
            if (roomsearch.getRoomNumber() == roomNo)
            {
                System.out.println(" Room Number Already exists");
                return;
            }

        }
        room.setRoomNumber(roomNo);

        System.out.println("Enter Room Type ");
        scan = new Scanner(System.in);
        room.setRoomType(scan.nextLine());

        System.out.println("Enter Bed Type");
        scan = new Scanner(System.in);
        room.setBedType(scan.nextLine());

        System.out.println("Enter Room Price");
        scan = new Scanner(System.in);
        room.setRoomPrice(scan.nextDouble());

        room.setRoomAvailable(true);

        roomlist.add(room);
        hotel.setRoomList(roomlist);

    }

    public void deleteRoom(Manager manager, Hotel hotel){

        System.out.println("Enter Room Number to delete");
        Scanner scan = new Scanner(System.in);
        int id  = scan.nextInt();

        ArrayList<Room> roomList = hotel.getRoomList();

        for(Room room : roomList){
            if(room.getRoomNumber() == id){
                roomList.remove(room);
                break;
            }
        }

        hotel.setRoomList(roomList);

    }

    public void updateRoom(Manager manager, Hotel hotel){

        System.out.println("Enter Room Number to update");
        Scanner scan = new Scanner(System.in);
        int roomNo  = scan.nextInt();

        System.out.println("Enter Updated Room Type ");
        scan = new Scanner(System.in);
        String roomType = scan.nextLine();

        System.out.println("Enter Updated Bed Type ");
        scan = new Scanner(System.in);
        String bedType = scan.nextLine();

        System.out.println("Enter Updates Room price");
        scan = new Scanner(System.in);
        Double salary = scan.nextDouble();

        ArrayList<Room> roomlist = hotel.getRoomList();

        for(Room room : roomlist){
            if(room.getRoomNumber() == roomNo){
                roomlist.remove(room);
                Room roomupdate = new Room();
                roomupdate.setRoomNumber(roomNo);
                roomupdate.setRoomType(roomType);
                roomupdate.setBedType(bedType);
                break;
            }
        }

        hotel.setRoomList(roomlist);

    }

     public void initializeRoom(Hotel hotel){

         ArrayList<Room> roomlist = new ArrayList<>();
         int singleroomNo = 100; int doubleroomNo = 200; int deluxeroomNo = 300; int suiteroomNo =400;
         for (int i=0; i<=20; i++)
         {
             Room room = new Room();
             room.setRoomNumber(singleroomNo++);
             room.setRoomType("Single Room");
             room.setBedType("Single Bed");
             room.setRoomPrice(100);
             room.setRoomAvailable(true);
             roomlist.add(room);
             hotel.setRoomList(roomlist);
             Room room1 = new Room();
             room1.setRoomNumber(doubleroomNo++);
             room1.setRoomType("Double Room");
             room1.setBedType("Double Bed");
             room1.setRoomPrice(150);
             room1.setRoomAvailable(true);
             roomlist.add(room1);
             hotel.setRoomList(roomlist);
             Room room2 = new Room();
             room2.setRoomNumber(deluxeroomNo++);
             room2.setRoomType("Deluxe Room");
             room2.setBedType("Queen Bed");
             room2.setRoomPrice(200);
             room2.setRoomAvailable(true);
             roomlist.add(room2);
             hotel.setRoomList(roomlist);
             Room room3 = new Room();
             room3.setRoomNumber(suiteroomNo++);
             room3.setRoomType("Suite");
             room3.setBedType("King Bed");
             room3.setRoomPrice(250);
             room3.setRoomAvailable(true);
             roomlist.add(room3);
             hotel.setRoomList(roomlist);

         }
     }


    // Testing For Room Add, Delete Update
    public static void main(String[] argC) {

        Manager manager = new Manager();
        Hotel hotel = new Hotel();
        RoomController controller = new RoomController();

        controller.createRoom(manager, hotel);
        controller.createRoom(manager, hotel);
        controller.createRoom(manager, hotel);
        for (Room room : hotel.getRoomList()) {
            System.out.println(room.getRoomNumber() + ":" + room.getRoomType() + ":" + room.getBedType() +":"+ room.getRoomPrice());
        }

        controller.deleteRoom(manager,hotel);
        for (Room room : hotel.getRoomList()) {
            System.out.println(room.getRoomNumber() + ":" + room.getRoomType()+ ":" + room.getBedType() +":"+ room.getRoomPrice());

        }

        controller.updateRoom(manager,hotel);
        for (Room room : hotel.getRoomList()) {
            System.out.println(room.getRoomNumber() + ":" + room.getRoomType()+ ":" + room.getBedType() +":"+ room.getRoomPrice());

        }

        controller.initializeRoom(hotel);
        for (Room room : hotel.getRoomList()) {
            System.out.println(room.getRoomNumber() + ":" + room.getRoomType() + ":" + room.getBedType() + ":" + room.getRoomPrice());
        }
    }
}
