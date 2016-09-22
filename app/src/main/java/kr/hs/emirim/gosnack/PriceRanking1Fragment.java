package kr.hs.emirim.gosnack;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;

import org.json.JSONArray;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


/**
 * A simple {@link Fragment} subclass.
 */
public class PriceRanking1Fragment extends Fragment {
    final static String TAG = "스낵:PriceRank1F";
    FragmentManager manager;  //Fragment를 관리하는 클래스의 참조변수
    FragmentTransaction tran;
    SnackAdapter myadapter;
    ListView listView;

    SnackServiece snackServiece;



    public PriceRanking1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_price_ranking1, container, false);
        listView = (ListView)view.findViewById(R.id.listview);
        manager = (FragmentManager) getFragmentManager();
        // 프래그먼트의 교체를 위해 프래그먼트 매니저의 정보를 가져옵니다.
        SnackServiece ss = SnackServiece.retrofit.create(SnackServiece.class);
        // Retrofit을 생성하는 SnackService를 가지고와서 만들어줍니다.
        Call<List<Snack>> call = ss.getAllSnack();
        // SnackService의 콜 함수를 불러 Snack의 정보를 불러오는 getAllSnack()메서드를 호출해 리스트를 만들어옵니다.
        call.enqueue(new Callback<List<Snack>>() {
            //큐에 저장해 놓았다가 나중에 실행하는(Call에서의 enqueue 함수를 통한 실행)해 콜백 리스트를 불러옵니다.
            @Override
            public void onResponse(Call<List<Snack>> call, Response<List<Snack>> response) {
                Log.d(TAG, "retrofit 성공");
                List<Snack> result = response.body();
                S.snacks=new ArrayList<Snack>(result);
                myadapter=new SnackAdapter(getActivity().getApplicationContext(), R.layout.listview_item, S.snacks);
                listView.setAdapter(myadapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView parent, View v, int position, long id) {
                        // get TextView's Text.
                        S.snack = S.snacks.get(position);
                        S.img =S.snack.getImg_info();

                        //S.snack_id=Integer.snacks.get(position).getId();
                        tran = manager.beginTransaction();
                        Fragment frag = new SnackInfoFragment();
                        tran.replace(R.id.view, frag);
                        tran.addToBackStack(null);
                        tran.commit();
                        // TODO : use strText
                    }
                }) ;
            }

            @Override
            public void onFailure(Call<List<Snack>> call, Throwable t) {
                Log.d(TAG, "retrofit 에러 " + t.getLocalizedMessage());
            }
        });

        Log.d(TAG, "retrofit 밖");

        Log.d(TAG, "view 바로 앞");

        return view;
    }

}
