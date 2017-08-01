package com.sjsu.architects;

/**
 * Created by sneha on 7/31/17.
 */
public class CheckPayment implements Payment {

    @Override
    public void processPayment(double amount) {

        System.out.println("  Please deposit check for  " + amount+ "$ at the Hotel dropbox ");

    }
}
