package com.example.gosnack_1;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.content.pm.ResolveInfo;

/**
 * Created by 내컴퓨터 on 2016-06-19.
 */

public class SettingActivity extends Activity
{
    Button facebookbt,twitter;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        /*facebookbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(android.content.Intent.EXTRA_TEXT,"Content to Share");
                PackageManager pm=v.getContext().getPackageManager();
                List<resolveinfo> activityList=pm.queryIntentActivities(intent,0);

            }
        });*/
    }
}