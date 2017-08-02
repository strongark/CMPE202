package com.sjsu.architects;

/**
 * Created by sneha on 7/31/17.
 */
public class DebitCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(double amount, int billId) {
        System.out.println("  Please swipe your debit card for " + amount+ "$ at the card reader");
    }
}
