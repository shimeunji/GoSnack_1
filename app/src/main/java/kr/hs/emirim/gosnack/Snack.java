package kr.hs.emirim.gosnack;

import com.google.gson.annotations.SerializedName;

/***
 * Created by 내컴퓨터on 2016-06-10.
 */
public class Snack {
    @SerializedName("id")
    String id;
    @SerializedName("name")
    String name;
    @SerializedName("company")
    String company;
    @SerializedName("img_rank")
    String img_rank;
    @SerializedName("img_info")
    String img_info;

    //    @SerializedName("result")
//    Result result;
//    @SerializedName("snack")
//    Snack snack;
//
//    public Result getResult() {return result;}
//    public Snack getWeather() {return snack;}
//
//    public class Result {
//        @SerializedName("message") String message;
//        @SerializedName("code") String code;
//
//        public String getMessage() {return message;}
//        public String getCode() {return code;}
//    }
//
    public Snack(String id, String name, String company, String img_rank, String img_info) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.img_rank = img_rank;
        this.img_info = img_info;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getImg_rank() {
        return img_rank;
    }

    public String getImg_info() {
        return img_info;
    }

    public void setImg_rank(String img_rank) {
        this.img_rank = img_rank;
    }

    public void setImg_info(String img_info) {
        this.img_info = img_info;
    }


}