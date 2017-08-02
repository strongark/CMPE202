package com.sjsu.architects;

/**
 * Created by sneha on 7/31/17.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class IdentityController {

    private static IdentityController instance = null;

    protected IdentityController(){

    }

    public static IdentityController getInstance(){
        if(instance==null)
            instance = new IdentityController();
        return instance;
    }
    ArrayList<Person> accountList = new ArrayList<>();

    public ArrayList<Person> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Person> accountList) {
        this.accountList = accountList;
    }

    public static int identity = 0;


    public void signUp(int accountType) {
        //console for input
        System.out.println(" Please Enter User Name ");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println(" Please Enter PassWord ");
        scan = new Scanner(System.in);
        String passWord = scan.nextLine();
        System.out.println(" Please Enter Full Name ");
        scan = new Scanner(System.in);
        String fullname = scan.nextLine();

        switch (accountType) {
            case 1:
                Manager manager = new Manager();
                manager.setId(identity++);
                manager.username = userName;
                manager.password = passWord;
                manager.name = fullname;
                accountList.add(manager);
            case 2:
                Staff staff = new Staff();
                staff.setId(identity++);
                staff.username = userName;
                staff.password = passWord;
                staff.name = fullname;
                accountList.add(staff);
            case 3:
                Member member = new Member(null);
                member.setId(identity++);
                member.username = userName;
                member.password = passWord;
                member.name = fullname;
                accountList.add(member);
        }
    }

    public void signUpStaff() {
        signUp(2);
    }

    public void signUpMember() {
        signUp(3);
    }

    public void signUpManager() {
        signUp(1);
    }

    public boolean signIn(){
        System.out.println(" Please Enter User Name ");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println(" Please Enter PassWord ");
        scan = new Scanner(System.in);
        String passWord = scan.nextLine();
        for(Person person: accountList)
        {
            if((person.getUsername().equals(userName)) && (person.getPassword().equals(passWord)))
            {
                return true;
            }
            else{

                System.out.println(" User Name and Password does not match  ");
                return false;
            }

        }
        return false;
    }

    public Person getAccountById(int id) {
        for (Person person : accountList) {
            if (person.getId() == id)
                return person;
        }
        return null;
    }

    public void createSampleData(){
        Manager manager = new Manager();
        manager.setId(++identity);
        manager.username = "admin";
        manager.password = "admin";
        manager.name = "The Architect";
        accountList.add(manager);
    }
}
