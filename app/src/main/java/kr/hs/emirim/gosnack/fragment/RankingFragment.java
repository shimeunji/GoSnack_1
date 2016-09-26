package kr.hs.emirim.gosnack.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import kr.hs.emirim.gosnack.CustomAdapter2;
import kr.hs.emirim.gosnack.PriceRanking1Fragment;
import kr.hs.emirim.gosnack.PriceRanking2Fragment;
import kr.hs.emirim.gosnack.R;
import kr.hs.emirim.gosnack.VoteFragment;


public class RankingFragment extends Fragment {

    FragmentManager manager;  //Fragment를 관리하는 클래스의 참조변수
    FragmentTransaction tran;  //실제로 Fragment를 추가/삭제/재배치 하는 클래스의 참조변수

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ranking, container, false);
        Fragment frag, frag2, frag3;
        manager = (FragmentManager) getFragmentManager();

        ImageButton more=(ImageButton)view.findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.more:
                        tran = manager.beginTransaction();
                        Fragment frag = new PriceRanking1Fragment();
                        tran.replace(R.id.ranking, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
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

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);
        CustomAdapter2 adapter= new CustomAdapter2(getActivity().getLayoutInflater());
        viewPager.setAdapter(adapter);
        viewPager.setPageMargin(getResources().getDisplayMetrics().widthPixels/-2);

        ImageButton homequize = (ImageButton) view.findViewById(R.id.homequize);
        homequize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.homequize:
                        Toast.makeText(getContext(), "아직 준비중인 서비스입니다^_^", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

}