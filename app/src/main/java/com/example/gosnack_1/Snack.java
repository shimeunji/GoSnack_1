package com.example.gosnack_1;

import android.graphics.Bitmap;

/**
 * Created by 내컴퓨터 on 2016-06-10.
 */
public class Snack {
    public String name;
    public Bitmap image;
    public String explation;

    public Snack(String name,Bitmap image,String explation)
    {
        this.name=name;
        this.image=image;
        this.explation=explation;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public Bitmap getImage()
    {
        return image;
    }
}
