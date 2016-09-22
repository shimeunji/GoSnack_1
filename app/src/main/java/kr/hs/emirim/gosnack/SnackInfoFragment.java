package kr.hs.emirim.gosnack;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


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
        String link=S.IMG_URL+S.snack.getImg_info();
        //Toast.makeText(getContext(),link,Toast.LENGTH_LONG).show();
        S.picasso.load(link).into(img);

        return view;
    }
}
