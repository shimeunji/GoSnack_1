package com.example.gosnack_1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.gosnack_1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstVoteFragment extends Fragment {
    WebView webView;
    final static String myBlogAddr = "https://goo.gl/forms/rVV1ly7ISACiCs8w2";
    String myUrl;

    public FirstVoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_first_vote, container, false);
        webView=(WebView)view.findViewById(R.id.link);
        webView.getSettings().setJavaScriptEnabled(true);      // 웹뷰에서 자바 스크립트 사용
        webView.loadUrl( "https://goo.gl/forms/rVV1ly7ISACiCs8w2" );            // 웹뷰에서 불러올 URL 입력
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
