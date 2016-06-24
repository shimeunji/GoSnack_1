package com.example.gosnack_1;


import android.content.Intent;
import android.net.Uri;
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
public class HomeFragment extends Fragment {
    ImageButton ib;
    FragmentManager manager;  //Fragment를 관리하는 클래스의 참조변수
    FragmentTransaction tran;
    public HomeFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        ib=(ImageButton)view.findViewById(R.id.img_link);
        Fragment frag,frag2;
        manager = (FragmentManager) getFragmentManager();
        ib.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                switch (v.getId()) {
                    case R.id.img_link:
                        tran = manager.beginTransaction();
                        Fragment frag = new FacebookLink();
                        tran.replace(R.id.home, frag);
                        tran.commit();
                        break;
                }
            }
        });

        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
