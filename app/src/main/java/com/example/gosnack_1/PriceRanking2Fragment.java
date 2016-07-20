package com.example.gosnack_1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class PriceRanking2Fragment extends Fragment {

    ImageButton i1,i2,i3,i4,i5;
    FragmentManager manager;  //Fragment를 관리하는 클래스의 참조변수
    FragmentTransaction tran;

    public PriceRanking2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_price_ranking2, container, false);
        final Fragment frag;
        manager = (FragmentManager) getFragmentManager();
        i1=(ImageButton)view.findViewById(R.id.rank1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.rank1:
                        tran = manager.beginTransaction();
                        Fragment frag1 = new SnackInfoFragment();
                        tran.replace(R.id.ranking, frag1);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        i2=(ImageButton)view.findViewById(R.id.rank2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.rank2:
                        tran = manager.beginTransaction();
                        Fragment frag1 = new SnackInfoFragment();
                        tran.replace(R.id.ranking, frag1);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        i3=(ImageButton)view.findViewById(R.id.rank3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.rank3:
                        tran = manager.beginTransaction();
                        Fragment frag1 = new SnackInfoFragment();
                        tran.replace(R.id.ranking, frag1);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        i4=(ImageButton)view.findViewById(R.id.rank4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.rank4:
                        tran = manager.beginTransaction();
                        Fragment frag1 = new SnackInfoFragment();
                        tran.replace(R.id.ranking, frag1);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        i5=(ImageButton)view.findViewById(R.id.rank5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.rank5:
                        tran = manager.beginTransaction();
                        Fragment frag1 = new SnackInfoFragment();
                        tran.replace(R.id.ranking, frag1);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });

        return view;
    }

}
