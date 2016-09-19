package com.example.gosnack_1;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by 내컴퓨터 on 2016-09-09.
 */
public interface SnackServiece {
    public static final String API_URL = "http://10.96.124.59/";

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(API_URL)
//            .client(new OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

//
//    @POST("/Snack")
//    Call<Snack>post_Snack(@Body Snack snack);

    @GET("snackdata.php")
    Call<List<Snack>>getAllSnack();
}
