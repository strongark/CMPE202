package com.sjsu.architects;

import java.util.Date;

public class Promotion {


    private String promotionID = null;
    private Date promotionStartDate = new Date();
    private Date promotionValidity = new Date();
    private double discountRatio;

    public String getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(String promotionID) {
        this.promotionID = promotionID;
    }

    public Date getPromotionStartDate() {
        return promotionStartDate;
    }

    public void setPromotionStartDate(Date promotionStartDate) {
        this.promotionStartDate = promotionStartDate;
    }

    public Date getPromotionValidity() {
        return promotionValidity;
    }

    public void setPromotionValidity(Date promotionValidity) {
        this.promotionValidity = promotionValidity;
    }

    public double getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(double discountRatio) {
        this.discountRatio = discountRatio;
    }




}
