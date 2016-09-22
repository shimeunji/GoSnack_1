package kr.hs.emirim.gosnack;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdVoteFragment extends Fragment {
    WebView webView;
    final static String myBlogAddr = "https://docs.google.com/forms/u/0/d/15zk3Pyd6zjs_Nfiyw8uOIabd8OZgZ2iEUuPxyhIED2o/edit";
    String myUrl;

    public ThirdVoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third_vote, container, false);
        webView = (WebView) view.findViewById(R.id.link);
        webView.getSettings().setJavaScriptEnabled(true);      // 웹뷰에서 자바 스크립트 사용
        webView.loadUrl("https://docs.google.com/forms/u/0/d/15zk3Pyd6zjs_Nfiyw8uOIabd8OZgZ2iEUuPxyhIED2o/edit");            // 웹뷰에서 불러올 URL 입력
        webView.setWebViewClient(new MyWebViewClient());
        return view;

    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            myUrl = url;
            view.loadUrl(url);
            return true;
        }
    }
}
