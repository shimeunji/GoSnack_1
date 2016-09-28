package kr.hs.emirim.gosnack.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.Random;

import kr.hs.emirim.gosnack.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RandomFragment extends Fragment {

    String[] snack = new String[]{"양파링", "포테토칩", "새우깡", "갈릭새우칩", "허니버터칩", "오징어땅콩", "통통치즈소세지", "생생칩(오리지널)", "생생칩(콘소메)", "신당동떡볶이", "오사쯔", "타코야끼볼", "콘포타츄", "구운양파", "구운오징어", "달고나팝콘", "맛동산", "생생칩(양파맛)", "구운인절미", "팝칩", "피자감자칩"};
    ImageButton im;

    public RandomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lotto, container, false);
        im = (ImageButton) view.findViewById(R.id.but_r);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int i = Math.abs(rand.nextInt(19) + 1);
                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                dialog.setTitle("과자 추천");
                dialog.setMessage(snack[i]);
                dialog.show();
                String str = "오늘의 과자" + snack[i];
                //Toast.makeText(getActivity(),str,Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
