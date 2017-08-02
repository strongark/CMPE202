package com.sjsu.architects;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sneha on 7/31/17.
 */
public class StaffController {

    public void createStaff(Manager manager){

        IdentityController idController = IdentityController.getInstance();

        Staff staff = new Staff();

        System.out.println("Enter staff name");
        Scanner scan = new Scanner(System.in);
        staff.setName(scan.nextLine());

//        System.out.println("Enter staff id");
//        scan = new Scanner(System.in);
//        staff.setId(scan.nextInt());
        staff.setId(++IdentityController.identity);

        System.out.println("Enter staff salary");
        scan = new Scanner(System.in);
        staff.setSalary(scan.nextDouble());

        ArrayList<Person> staffList = manager.getStaffList();


        staffList.add(staff);


        idController.setAccountList(staffList);


    }

    public void deleteStaff(Manager manager){

        System.out.println("Enter staff id to delete");
        Scanner scan = new Scanner(System.in);
        int id  = scan.nextInt();

        IdentityController identityController = IdentityController.getInstance();
        ArrayList<Person> staffList = identityController.getAccountList();

        for(Person person : staffList){
            if(person.getId() == id){
                staffList.remove(person);
                break;
            }
        }

    }

    public void updateStaff(Manager manager){

        System.out.println("Enter staff id to update");
        Scanner scan = new Scanner(System.in);
        int id  = scan.nextInt();

        System.out.println("Enter Updated staff name ");
        scan = new Scanner(System.in);
        String staffName = scan.nextLine();

        System.out.println("Enter Updated staff salary");
        scan = new Scanner(System.in);
        Double salary = scan.nextDouble();

        IdentityController identityController = IdentityController.getInstance();
        ArrayList<Person> staffList = identityController.getAccountList();

        for(Person person : staffList){
            if(person.getId() == id){
                staffList.remove(person);
                Staff staff = new Staff();
                staff.setId(id);
                staff.setName(staffName);
                staff.setSalary(salary);
                staffList.add(staff);
                break;
            }
        }

        identityController.setAccountList(staffList);

    }

    // Test Adding Staff, Deleting Staff and Updating Staff

    public static void main(String[] argC) {

        Manager manager = new Manager();
        StaffController controller = new StaffController();
        controller.createStaff(manager);
        controller.createStaff(manager);

        IdentityController identityController = IdentityController.getInstance();
        ArrayList<Person> staffList = identityController.getAccountList();


        for (Person person : identityController.getAccountList()) {
            //typecasting Staff as person as only the staff has the salary details
            Staff staff = (Staff) person;
            System.out.println(staff.getId() + ":" + staff.getName()+ ":" + staff.getSalary());

        }

        controller.deleteStaff(manager);
        for (Person person : identityController.getAccountList()) {
            Staff staff = (Staff) person;
            System.out.println(staff.getId() + ":" + staff.getName()+ ":" + staff.getSalary());

        }

        controller.updateStaff(manager);
        for (Person person : identityController.getAccountList()) {
            Staff staff = (Staff) person;
            System.out.println(staff.getId() + ":" + staff.getName()+ ":" + staff.getSalary());

        }

    }
}
