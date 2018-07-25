package com.example.abdurahman.ecommerseapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by abdurahman on 16/07/2018.
 */
@Entity
public class Business {

   public String name;
   public String amount;
   public String item;
   public String date;
   public String location;
   public String contact;
   public String comment;
   public String quantity;
   public String paymentmode;

    @PrimaryKey(autoGenerate = true)
    private int businessId;

    public Business(String name, String amount, String item, String date, String location, String contact, String comment, String quantity, String paymentmode, int businessId) {
        this.name = name;
        this.amount = amount;
        this.item = item;
        this.date = date;
        this.location = location;
        this.contact = contact;
        this.comment = comment;
        this.quantity = quantity;
        this.paymentmode = paymentmode;
        this.businessId = businessId;
    }
@Ignore
    public Business(String name, String amount, String item, String date, String location, String contact, String comment, String quantity, String paymentmode) {
        this.name = name;
        this.amount = amount;
        this.item = item;
        this.date = date;
        this.location = location;
        this.contact = contact;
        this.comment = comment;
        this.quantity = quantity;
        this.paymentmode = paymentmode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPaymentmode() {
        return paymentmode;
    }

    public void setPaymentmode(String paymentmode) {
        this.paymentmode = paymentmode;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }
}
