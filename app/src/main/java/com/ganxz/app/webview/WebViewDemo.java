package com.ganxz.app.webview;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.ganxz.app.R;

public class WebViewDemo extends AppCompatActivity {

    private static final String TAG = "WebViewDemo";

    private  WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_demo);

        initWebView();

        findViewById(R.id.webview_demo_load_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtUrl = ((EditText)findViewById(R.id.webview_demo_edit_txt)).getText().toString();
                loadUrl(txtUrl);
            }
        });

    }

    private void initWebView(){
        webView = (WebView) findViewById(R.id.webview_demo_webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
    }


    private void loadUrl(String txtUrl){

        webView.loadUrl(txtUrl);
    }
}
