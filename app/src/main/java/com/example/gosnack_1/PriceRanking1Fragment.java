package com.example.gosnack_1;

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
    JSONArray snack = null;
    ArrayList<HashMap<String, String>> h_info_list;
    Retrofit retrofit;
    SnackServiece snackServiece;

    public PriceRanking1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_price_ranking1, container, false);


        SnackServiece ss = SnackServiece.retrofit.create(SnackServiece.class);
        Call<List<Snack>> call = ss.getAllSnack();
        call.enqueue(new Callback<List<Snack>>() {
            @Override
            public void onResponse(Call<List<Snack>> call, Response<List<Snack>> response) {
                List<Snack> result = response.body();
                for(int i = 0; i < result.size(); i ++){
                    Log.d(TAG, result.get(i).getName() );
                }
            }

            @Override
            public void onFailure(Call<List<Snack>> call, Throwable t) {

            }
        });


//
//        ApplicationController application=ApplicationController.getInstance();
//        application.buildSnackService();
//        snackServiece=ApplicationController.getInstance().getSnackServiece();
//        final Call<List<Snack>> snackList=snackServiece.getAllSnack();
//        snackList.enqueue(new Callback<List<Snack>>() {
//            @Override
//            public void onResponse(Response<List<Snack>> response) {
//                if(response.isSuccess())
//                {
//                    List<Snack> snacks=response.body();
//                    String print="";
//
//                    for(Snack snack:snacks)
//                    {
//                        print+=snack.getId()+" "+snack.getName()+" "+snack.getCompany();
//                    }
//
//
//                }
//                else{
//                    int statusCode=response.code();
//                    Log.i("MyTag","응답코드 : "+statusCode);
//                }
//
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//
//            }
//        });
        return view;
    }


}
