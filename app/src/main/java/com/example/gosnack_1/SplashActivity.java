package com.example.gosnack_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by LG on 2016-08-01.
 */
public class SplashActivity  extends Activity {
    protected void onCreate(Bundle savedInsatanceState){
        super.onCreate(savedInsatanceState);

        try{
            //2초간 대기하고
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,TabLayoutDemoActivity.class));
        finish();
    }
}