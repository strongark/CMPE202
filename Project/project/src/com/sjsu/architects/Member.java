package com.sjsu.architects;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Member extends Person {

    //should this be there since we have person ID
   // private int memberId;

    /*public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
*/


    public Member(){

    }

    //*start observer pattern
    public Member(PromotionController promotion){

        promotion.subscribe(this);
    }

    // Use Constructor or a subscribe method to attach to Observe
    public void subscribeToPromotionCode(PromotionController promotion){

        promotion.subscribe(this);
    }

    public void update(){
        System.out.println("Members received promotion code!!");
    }
    //*end observer pattern


}
