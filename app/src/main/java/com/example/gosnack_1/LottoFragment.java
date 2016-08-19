package com.example.gosnack_1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class LottoFragment extends Fragment {

    String[] snack = new String[]{"양파링","포테토칩","새우깡","갈릭새우칩","허니버터칩","오징어땅콩","통통치즈소세지","생생칩(오리지널)","생생칩(콘소메)","신당동떡볶이","오사쯔","타코야끼볼","콘포타츄","구운양파","구운오징어","달고나팝콘","맛동산","생생칩(양파맛)","구운인절미","팝칩","피자감자칩"};
    ImageButton b1,b2,b3,b4,b5,b6;
    FragmentManager manager;  //Fragment를 관리하는 클래스의 참조변수
    FragmentTransaction tran;  //실제로 Fragment를 추가/삭제/재배치 하는 클래스의 참조변수
    public LottoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_randomhome_, container, false);
        Fragment frag;
        manager = (FragmentManager) getFragmentManager();
        b1=(ImageButton)view.findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.b1:
                        tran = manager.beginTransaction();
                        Fragment frag = new RandomFragment();
                        tran.replace(R.id.random, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        b2=(ImageButton)view.findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.b2:
                        tran = manager.beginTransaction();
                        Fragment frag = new RandomFragment();
                        tran.replace(R.id.random, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        b3=(ImageButton)view.findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.b3:
                        tran = manager.beginTransaction();
                        Fragment frag = new RandomFragment();
                        tran.replace(R.id.random, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        b4=(ImageButton)view.findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.b4:
                        tran = manager.beginTransaction();
                        Fragment frag = new RandomFragment();
                        tran.replace(R.id.random, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        b5=(ImageButton)view.findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.b5:
                        tran = manager.beginTransaction();
                        Fragment frag = new RandomFragment();
                        tran.replace(R.id.random, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        b6=(ImageButton)view.findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.b6:
                        tran = manager.beginTransaction();
                        Fragment frag = new RandomFragment();
                        tran.replace(R.id.random, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        return view;
    }
}



