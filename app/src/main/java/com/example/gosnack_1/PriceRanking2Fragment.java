package com.example.gosnack_1;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.gosnack_1.R;
import com.example.gosnack_1.Snack;
import com.example.gosnack_1.SnackAdapter;

import java.util.ArrayList;

public class PriceRanking2Fragment extends Fragment {

    ImageButton i1,i2,i3,i4,i5;
    FragmentManager manager;  //Fragment를 관리하는 클래스의 참조변수
    FragmentTransaction tran;
    public ListView listView;
    ArrayList<Snack> h_info_list;
    SnackAdapter myadapter;
    Snack snack1, snack2, snack3, snack4, snack5, snack6, snack7, snack8, snack9, snack10, snack11, snack12, snack13, snack14, snack15, snack16, snack17, snack18, snack19, snack20, snack21, snack22, snack23, snack24, snack25, scnack26, snack27, snack28, snack29, snack30;


    public PriceRanking2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_price_ranking2, container, false);
        listView = (ListView)view.findViewById(R.id.list);
        snack1 = new Snack("양파링", BitmapFactory.decodeResource(getResources(), R.drawable.gwaza1),"해태");
        snack2 = new Snack("포테토칩", BitmapFactory.decodeResource(getResources(), R.drawable.gwaza2),"농심");
        snack3 = new Snack("새우깡", BitmapFactory.decodeResource(getResources(), R.drawable.gwaza3),"해태");
        snack4 = new Snack("갈릭새우칩", BitmapFactory.decodeResource(getResources(), R.drawable.gwaza4),"해태");
        snack5 = new Snack("허니버터칩", BitmapFactory.decodeResource(getResources(), R.drawable.gwaza5),"해태");
        snack6 = new Snack("오징어땅콩", BitmapFactory.decodeResource(getResources(), R.drawable.snack1),"해태");
        snack7 = new Snack("통통치즈소세지", BitmapFactory.decodeResource(getResources(), R.drawable.snack2),"해태");
        snack8 = new Snack("생생칩(오리지널)", BitmapFactory.decodeResource(getResources(), R.drawable.snack3),"해태");
        snack9 = new Snack("생생칩(콘소메)", BitmapFactory.decodeResource(getResources(), R.drawable.snack4),"해태");
        snack10 = new Snack("신당동떡볶이", BitmapFactory.decodeResource(getResources(), R.drawable.snack5),"해태");
        snack11 = new Snack("오사쯔", BitmapFactory.decodeResource(getResources(), R.drawable.snack6),"해태");
        snack12 = new Snack("타코야끼볼", BitmapFactory.decodeResource(getResources(), R.drawable.snack7),"해태");
        snack13 = new Snack("콘포타츄", BitmapFactory.decodeResource(getResources(), R.drawable.snack8),"해태");
        snack14 = new Snack("구운양파", BitmapFactory.decodeResource(getResources(), R.drawable.snack9),"해태");
        snack15 = new Snack("구운오징어", BitmapFactory.decodeResource(getResources(), R.drawable.snack10),"해태");
        snack15 = new Snack("달고나팝콘", BitmapFactory.decodeResource(getResources(), R.drawable.snack11),"해태");
        snack16 = new Snack("맛동산", BitmapFactory.decodeResource(getResources(), R.drawable.snack12),"해태");
        snack17 = new Snack("생생칩(양파맛)", BitmapFactory.decodeResource(getResources(), R.drawable.snack13),"해태");
        snack18 = new Snack("구운인절미", BitmapFactory.decodeResource(getResources(), R.drawable.snack14),"해태");
        snack19 = new Snack("팝칩", BitmapFactory.decodeResource(getResources(), R.drawable.snack15),"해태");
        snack20 = new Snack("피자감자칩", BitmapFactory.decodeResource(getResources(), R.drawable.snack16),"해태");

        h_info_list = new ArrayList<Snack>();
        h_info_list.add(snack1);
        h_info_list.add(snack2);
        h_info_list.add(snack3);
        h_info_list.add(snack4);
        h_info_list.add(snack5);
        h_info_list.add(snack6);
        h_info_list.add(snack7);
        h_info_list.add(snack8);
        h_info_list.add(snack9);
        h_info_list.add(snack10);
        h_info_list.add(snack11);
        h_info_list.add(snack12);
        h_info_list.add(snack14);
        h_info_list.add(snack15);
        h_info_list.add(snack16);
        h_info_list.add(snack17);
        h_info_list.add(snack18);
        h_info_list.add(snack19);
        h_info_list.add(snack20);

        myadapter = new SnackAdapter(getActivity().getApplicationContext(), R.layout.fragment_price_ranking1_item, h_info_list);
        listView.setAdapter(myadapter);

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Intent intent = new Intent(getApplicationContext(), .class); // 다음넘어갈 화면
                Bitmap sendBitmap = h_info_list.get(position).image;

                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                sendBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();

                //intent.putExtra("image", byteArray);
                //startActivity(intent);
            }
        });*/

        return view;
    }

}
