package com.example.gosnack_1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;

public class RankingFragment extends Fragment{

    FragmentManager manager;  //Fragment를 관리하는 클래스의 참조변수
    FragmentTransaction tran;  //실제로 Fragment를 추가/삭제/재배치 하는 클래스의 참조변수

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ranking, container, false);
        Fragment frag,frag2,frag3;
        manager = (FragmentManager) getFragmentManager();

        ImageButton but_1 = (ImageButton) view.findViewById(R.id.button);
        but_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button:
                        tran = manager.beginTransaction();
                        Fragment frag = new PriceRanking1Fragment();
                        tran.replace(R.id.ranking, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        ImageButton but_2 = (ImageButton) view.findViewById(R.id.button2);
        but_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button2:
                        tran = manager.beginTransaction();
                        Fragment frag2 = new PriceRanking2Fragment();
                        tran.replace(R.id.ranking, frag2);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        ImageButton but_3 = (ImageButton) view.findViewById(R.id.vote);
        but_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.vote:
                        tran = manager.beginTransaction();
                        Fragment frag = new VoteFragment();
                        tran.replace(R.id.ranking, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        return view;
    }
}