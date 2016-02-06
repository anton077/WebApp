package com.n0name.webapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView browser = (WebView) findViewById(R.id.webby);
        //WebView browser2 =(WebView)findViewById(R.id.webbrowser);
        browser.getSettings().setJavaScriptEnabled(true);
        // String str = "<body><h2>boga goga</h2><h4>gogo mogo";
        // str += "lala</h4></body>";

//change!@@

        browser.setWebViewClient(new URLIntercepter());
        //   browser.loadData(str, "text/html", "UTF-8");
        browser.loadUrl("https://n0namesite.wordpress.com/");

        // browser2.loadData(str,"text/html","UTF-8");
    }
}
