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
public class FacebookLink extends Fragment {
    WebView webView;
    final static String myBlogAddr = "https://www.facebook.com/snackgwaza/?fref=ts";
    String myUrl;

    public FacebookLink() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_facebook_link, container, false);
        webView=(WebView)view.findViewById(R.id.link);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new MyWebViewClient());

        if(myUrl == null){
            myUrl = myBlogAddr;
        }
        webView.loadUrl(myUrl);

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
