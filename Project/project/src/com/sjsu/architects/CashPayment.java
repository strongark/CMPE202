package com.sjsu.architects;

/**
 * Created by sneha on 7/31/17.
 */
public class CashPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("  Please pay " + amount+ "$ to the Hotel Staff");
    }
}
