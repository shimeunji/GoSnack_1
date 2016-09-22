package kr.hs.emirim.gosnack;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ListView;

import com.kakao.kakaolink.KakaoLink;
import com.kakao.kakaolink.KakaoTalkLinkMessageBuilder;
import com.kakao.util.KakaoParameterException;

/**
 * Created by 내컴퓨터 on 2016-06-19.
 */
public class SettingActivity extends ActionBarActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }
    public void shareKakao(View v){
        try {
            final KakaoLink kakaoLink = KakaoLink.getKakaoLink(getApplicationContext());
            KakaoTalkLinkMessageBuilder kakaoTalkLinkMessageBuilder = kakaoLink.createKakaoTalkLinkMessageBuilder();
            /*메시지 추가*/
            kakaoTalkLinkMessageBuilder.addText("<스낵먹으러과자>");

            /*이미지 가로/세로 사이즈는 80px 보다 커야하며, 이미지 용량은 500kb 이하로 제한된다.
            String url = "http://upload2.inven.co.kr/upload/2015/09/27/bbs/i12820605286.jpg";
            kakaoBuilder.addImage(url, 1080, 1920);*/

            /*앱 실행버튼 추가*/
            kakaoTalkLinkMessageBuilder.addAppButton("앱 실행");

            /*메시지 발송*/
            kakaoLink.sendMessage(kakaoTalkLinkMessageBuilder, this );
            kakaoTalkLinkMessageBuilder=kakaoLink.createKakaoTalkLinkMessageBuilder();
        } catch (KakaoParameterException e) {
            e.printStackTrace();
        }
    }
}