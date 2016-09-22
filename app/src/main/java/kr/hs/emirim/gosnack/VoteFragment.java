package kr.hs.emirim.gosnack;

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
public class VoteFragment extends Fragment {
    ImageButton but1, but2, but3;
    FragmentManager manager;  //Fragment를 관리하는 클래스의 참조변수
    FragmentTransaction tran;

    public VoteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vote, container, false);
        final Fragment frag;
        manager = (FragmentManager) getFragmentManager();
        but1 = (ImageButton) view.findViewById(R.id.vote_1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.vote_1:
                        tran = manager.beginTransaction();
                        Fragment frag1 = new FirstVoteFragment();
                        tran.replace(R.id.ranking, frag1);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        but2 = (ImageButton) view.findViewById(R.id.vote_2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.vote_2:
                        tran = manager.beginTransaction();
                        Fragment frag1 = new FirstVoteFragment();
                        tran.replace(R.id.ranking, frag1);
                        tran.addToBackStack(null);
                        tran.commit();
                        break;
                }
            }
        });
        but3 = (ImageButton) view.findViewById(R.id.vote_3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.vote_3:
                        tran = manager.beginTransaction();
                        Fragment frag1 = new FirstVoteFragment();
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
