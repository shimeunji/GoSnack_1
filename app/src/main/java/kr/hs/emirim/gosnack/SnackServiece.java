package kr.hs.emirim.gosnack;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by 내컴퓨터 on 2016-09-09.
 */
public interface SnackServiece {
    public static final String API_URL = "http://gosnack.emirim.kr/api/";
    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(API_URL)
            //.client(new OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build();
//
//    @POST("/Snack")
//    Call<Snack>post_Snack(@Body Snack snack);

    // 과자 랭킹 (전체보여줌)
    @GET("snacks")
    Call<List<Snack>>getAllSnack();

    // 과자 랜덤
    @GET("snack/random")
    Call<Snack> getRandomSnack();

    // 과자 검색
    @GET("snacks/find/{search}")
    Call<List<Snack>>getSearchSnack(@Path("search") String search);

    //과자 정보
    @GET("snack/{id}")
    Call<Snack> getInfoSnack(@Path("id")int id);

}
