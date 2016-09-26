package kr.hs.emirim.gosnack.fragment;


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
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

import kr.hs.emirim.gosnack.CustomAdapter;
import kr.hs.emirim.gosnack.R;
import kr.hs.emirim.gosnack.S;
import kr.hs.emirim.gosnack.Snack;
import kr.hs.emirim.gosnack.SnackInfoFragment;
import kr.hs.emirim.gosnack.SnackServiece;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Path;

import static java.security.AccessController.getContext;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    FragmentManager manager;  //Fragment를 관리하는 클래스의 참조변수
    FragmentTransaction tran;
    ImageButton i1,i2,i3;
    LinearLayout lin;
    SnackServiece ss;
    public HomeFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        lin=(LinearLayout)view.findViewById(R.id.viewpa);
        lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"아직 준비중인 서비스입니다 ^_^",Toast.LENGTH_LONG).show();
            }
        });


        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);
        viewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"아직 준비중인 서비스입니다 ^_^",Toast.LENGTH_LONG).show();
            }
        });
        i1=(ImageButton)view.findViewById(R.id.snackid2);
        i2=(ImageButton)view.findViewById(R.id.snackid13);
        i3=(ImageButton)view.findViewById(R.id.snackid16);
        //ViewPager에 설정할 Adapter 객체 생성
        //ListView에서 사용하는 Adapter와 같은 역할.
        //다만. ViewPager로 스크롤 될 수 있도록 되어 있다는 것이 다름
        //PagerAdapter를 상속받은 CustomAdapter 객체 생성
        //CustomAdapter에게 LayoutInflater 객체 전달
        CustomAdapter adapter = new CustomAdapter(getActivity().getLayoutInflater());
        manager = (FragmentManager) getFragmentManager();

        //ViewPager에 Adapter 설정
        viewPager.setAdapter(adapter);

                viewPager.setPageMargin(getResources().getDisplayMetrics().widthPixels / -8);
        viewPager.setOffscreenPageLimit(2);


        viewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/snackg waza/"));
                startActivity(intent);
            }
        });

        ss = SnackServiece.retrofit.create(SnackServiece.class);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call call = ss.getInfoSnack(2);
                call.enqueue(new Callback<Snack>() {
                    @Override
                    public void onResponse(Call<Snack> call, Response<Snack> response) {

                        Snack snack = response.body();
                        S.snack = snack;
                        //S.img =S.snack.getImg_info();
                        //S.snack_id=Integer.snacks.get(position).getId();
                        tran = manager.beginTransaction();
                        Fragment frag = new SnackInfoFragment();
                        tran.replace(R.id.view, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                    }
                    @Override
                    public void onFailure(Call call, Throwable t) {

                    }
                });
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call call = ss.getInfoSnack(13);
                call.enqueue(new Callback<Snack>() {
                    @Override
                    public void onResponse(Call<Snack> call, Response<Snack> response) {
                        Snack snack = response.body();
                        S.snack = snack;
                        //S.img =S.snack.getImg_info();
                        //S.snack_id=Integer.snacks.get(position).getId();
                        tran = manager.beginTransaction();
                        Fragment frag = new SnackInfoFragment();
                        tran.replace(R.id.view, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                    }

                    @Override
                    public void onFailure(Call call, Throwable t) {
                    }

                });
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call call = ss.getInfoSnack(16);
                call.enqueue(new Callback<Snack>() {
                    @Override
                    public void onResponse(Call<Snack> call, Response<Snack> response) {
                        Snack snack = response.body();
                        S.snack = snack;
                        //S.img =S.snack.getImg_info();
                        //S.snack_id=Integer.snacks.get(position).getId();
                        tran = manager.beginTransaction();
                        Fragment frag = new SnackInfoFragment();
                        tran.replace(R.id.view, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                    }

                    @Override
                    public void onFailure(Call call, Throwable t) {
                    }

                });
            }
        });

        return view;
    }
}
