package com.example.gosnack_1;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment{
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
        ViewPager viewPager = (ViewPager)view.findViewById(R.id. pager);

        //ViewPager에 설정할 Adapter 객체 생성
        //ListView에서 사용하는 Adapter와 같은 역할.
        //다만. ViewPager로 스크롤 될 수 있도록 되어 있다는 것이 다름
        //PagerAdapter를 상속받은 CustomAdapter 객체 생성
        //CustomAdapter에게 LayoutInflater 객체 전달
        CustomAdapter adapter= new CustomAdapter(getActivity().getLayoutInflater());

        //ViewPager에 Adapter 설정
        viewPager.setAdapter(adapter);
        /*manager = (FragmentManager) getFragmentManager();
        ib=(ImageButton)view.findViewById(R.id.);
        ib.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                switch (v.getId()) {
                    case R.id.img_link:
                        tran = manager.beginTransaction();
                        Fragment frag = new FacebookLink();
                        tran.replace(R.id.home, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });*/


        return view;
    }


}
