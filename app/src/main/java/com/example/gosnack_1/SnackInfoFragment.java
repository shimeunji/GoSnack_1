package com.example.gosnack_1;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
public class SnackInfoFragment extends Fragment {
    ImageView img;
    public SnackInfoFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_snack_info, container, false);
        img=(ImageView)view.findViewById(R.id.img);
        Toast.makeText(getContext(),S.snack.getName(),Toast.LENGTH_LONG).show();
        S.picasso.load(S.IMG_URL + S.snack.getImg_info()).into(img);

        return view;
    }
}
