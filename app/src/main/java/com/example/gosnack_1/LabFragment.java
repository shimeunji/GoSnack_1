package com.example.gosnack_1;


import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class LabFragment extends Fragment {
    ImageButton ib, ib2, ib3;
    FragmentManager manager;  //Fragment를 관리하는 클래스의 참조변수
    FragmentTransaction tran;

    //ImageButton but1,but2;

    public LabFragment() {
        // Required empty public constructor
    }


        @Override
        public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_lab, container, false);
            // Inflate the layout for this fragment
            ib = (ImageButton) view.findViewById(R.id.lab1);
            ib2 = (ImageButton) view.findViewById(R.id.lab2);
            ib3 = (ImageButton) view.findViewById(R.id.lab3);
            manager = (FragmentManager) getFragmentManager();
            ib.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.lab1:

                            String id = "EYOmgsE5gzU";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=" + id));
                            intent.putExtra("VIDEO_ID", id);


                            startActivity(intent);
                            break;

                    }
                }
            });
            ib2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.lab2:
                            String id = "X-NOHh8kf7o";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=" + id));
                            intent.putExtra("VIDEO_ID", id);
                            startActivity(intent);
                            break;
                    }
                }
            });
            ib3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.lab3:
                            String id = "whgANpcp3-g";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=" + id));
                            intent.putExtra("VIDEO_ID", id);
                            startActivity(intent);
                            break;
                    }
                }
            });

            return view;
        }

    }

