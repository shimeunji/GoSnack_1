package com.example.gosnack_1;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

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
        Picasso.with(getActivity().getApplicationContext()).load(SnackAdapter.info_url).into(img);

        return view;
    }
}
