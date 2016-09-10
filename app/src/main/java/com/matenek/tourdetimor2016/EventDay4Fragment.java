package com.matenek.tourdetimor2016;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by admin on 06/09/16.
 */
public class EventDay4Fragment extends Fragment {


    View rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.eventday4fragment_layout, container, false);

        final ProgressBar Pbar;
        final TextView txtview = (TextView) rootView.findViewById(R.id.tV1);
        Pbar = (ProgressBar) rootView.findViewById(R.id.pB1);

        WebView lWebView = (WebView) rootView.findViewById(R.id.webView);
        WebSettings webSettings = lWebView.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setJavaScriptEnabled(true);
        lWebView.setWebChromeClient(new WebChromeClient(){
            public void onProgressChanged(WebView view, int progress) {
                if(progress < 100 && Pbar.getVisibility() == ProgressBar.GONE){
                    Pbar.setVisibility(ProgressBar.VISIBLE);
                    txtview.setVisibility(View.VISIBLE);
                }

                Pbar.setProgress(progress);
                if(progress == 100) {
                    Pbar.setVisibility(ProgressBar.GONE);
                    txtview.setVisibility(View.GONE);
                }
            }
        });
        lWebView.loadUrl("file:///android_asset/eventday4.html");

        return rootView ;

    }


}
