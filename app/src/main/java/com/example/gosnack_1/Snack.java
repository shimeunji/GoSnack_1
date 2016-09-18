package com.example.gosnack_1;
import android.graphics.Bitmap;

import com.google.android.gms.common.api.Result;
import com.google.gson.annotations.SerializedName;

/*** Created by 내컴퓨터on 2016-06-10.*/
public class Snack {
    @SerializedName("id") String id;
    @SerializedName("name") String name;
    @SerializedName("company") String company;
    @SerializedName("quantity") String quantity;
    @SerializedName("cal") String cal;
    @SerializedName("price") String price;
    @SerializedName("img_link") String img_link;

//    @SerializedName("result")
//    Result result;
//    @SerializedName("snack")
//    Snack snack;
//
//    public Result getResult() {return result;}
//    public Snack getWeather() {return snack;}
//
//    public class Result {
//        @SerializedName("message") String message;
//        @SerializedName("code") String code;
//
//        public String getMessage() {return message;}
//        public String getCode() {return code;}
//    }
//
    public Snack(String id,String name,String company,String quantity,String cal,String price,String img_link){
        this.id=id;
        this.name=name;
        this.company=company;
        this.quantity=quantity;
        this.cal=cal;
        this.price=price;
        this.img_link=img_link;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getCal() {
        return cal;
    }

    public String getPrice() {
        return price;
    }

    public String getImg_link() {
        return img_link;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setCal(String cal) {
        this.cal = cal;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImg_link(String img_link) {
        this.img_link = img_link;
    }
}