package kr.hs.emirim.gosnack;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

import kr.hs.emirim.gosnack.models.Post;
import kr.hs.emirim.gosnack.models.User;

import kr.hs.emirim.gosnack.models.User;
import kr.hs.emirim.gosnack.models.Vote;

import static com.google.android.gms.wearable.DataMap.TAG;
import static kr.hs.emirim.gosnack.S.cn4;

/**
 * A simple {@link Fragment} subclass.
 */
public class VoteFragment extends Fragment {
    RadioButton r1,r2,r3,r4,r5;
    Button b; TextView tv;
    String show;
    Double count1,count2,count3,count4,count5;


    // [START declare_database_ref]
    private DatabaseReference mDatabase;
    // [END declare_database_ref]

    public VoteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vote, container, false);

        mDatabase= FirebaseDatabase.getInstance().getReference();

        mDatabase.child("votes/cnt1").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                count1=dataSnapshot.getValue(Double.class);

            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mDatabase.child("votes/cnt2").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                count2=dataSnapshot.getValue(Double.class);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        }); mDatabase.child("votes/cnt3").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                count3=dataSnapshot.getValue(Double.class);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); mDatabase.child("votes/cnt4").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                count4=dataSnapshot.getValue(Double.class);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }); mDatabase.child("votes/cnt5").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                count5=dataSnapshot.getValue(Double.class);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        r1=(RadioButton)view.findViewById(R.id.radioButton1);
        r2=(RadioButton)view.findViewById(R.id.radioButton2);
        r3=(RadioButton)view.findViewById(R.id.radioButton3);
        r4=(RadioButton)view.findViewById(R.id.radioButton4);
        r5=(RadioButton)view.findViewById(R.id.radioButton5);
        b=(Button)view.findViewById(R.id.bt);
        tv=(TextView)view.findViewById(R.id.show);

        r1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mDatabase.child("votes/cnt1").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                         count1 = dataSnapshot.getValue(Double.class);
                        count1++;
                        mDatabase.child("votes/cnt1").setValue(count1);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
//                mDatabase.updateChildren(childUpdates);
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.child("votes/cnt2").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                         count2 = dataSnapshot.getValue(Double.class);
                        count2++;
                        mDatabase.child("votes/cnt2").setValue(count2);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.child("votes/cnt3").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                         count3 = dataSnapshot.getValue(Double.class);
                        count3++;
                        mDatabase.child("votes/cnt3").setValue(count3);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.child("votes/cnt4").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                         count4 = dataSnapshot.getValue(Double.class);
                        count4++;
                        mDatabase.child("votes/cnt4").setValue(count4);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            }
        });
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.child("votes/cnt5").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                         count5 = dataSnapshot.getValue(Double.class);
                        count5++;
                        mDatabase.child("votes/cnt5").setValue(count5);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {


                show="투표 결과\n";
                show+="바나나킥 "+count1+"\n";
                show+="칙촉 "+count2+"\n";
                show+="허니버터칩 "+count3+"\n";
                show+="꿀꽈배기 "+count4+"\n";
                show+="콘초 "+count5+"\n";
                tv.setText(show);
            }
            public Query getQuery(DatabaseReference databaseReference) {
                // [START recent_posts_query]
                // Last 100 posts, these are automatically the 100 most recent
                // due to sorting by push() keys
                Query recentPostsQuery = databaseReference.child("votes")
                        .limitToFirst(100);
                // [END recent_posts_query]

                return recentPostsQuery;
            }



        });


        return view;
    }

    public String getUid() {
        return FirebaseAuth.getInstance().getCurrentUser().getUid();
    }

}


