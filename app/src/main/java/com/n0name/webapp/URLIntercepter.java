package com.n0name.webapp;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by N0Name on 06-Feb-16.
 */
public class URLIntercepter extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;

    }
}