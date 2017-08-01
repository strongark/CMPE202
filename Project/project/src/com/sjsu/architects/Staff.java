package com.sjsu.architects;

import java.util.ArrayList;

public class Staff extends Person {

    //should we have staff ID seperately as we have person ID
    private int staffId;
    private double salary;

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




}
