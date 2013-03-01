package com.sinfo.badaplication;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewExercise extends Activity{
	
	private final String HTML_TESTS_URL = "http://html5test.com/";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//show URL on top
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB){
			getActionBar().setSubtitle(HTML_TESTS_URL);
		} else{
			setTitle(HTML_TESTS_URL);
		}
		
		WebView wb = new WebView(this);
		//page to load
		wb.loadUrl(HTML_TESTS_URL);
		
		WebSettings webSettings = wb.getSettings();
		
		//page needs javascript enabled to run
		webSettings.setJavaScriptEnabled(true);
		
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_MR1) {
			webSettings.setDomStorageEnabled(true);
			webSettings.setAppCacheEnabled(true);
			webSettings.setAppCachePath(getCacheDir().getAbsolutePath());
	        webSettings.setAppCacheMaxSize(1 * 1024 * 1024);
		}
		
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR) {
	        webSettings.setDatabaseEnabled(true);
	        webSettings.setDatabasePath("/data/data/" + getPackageName() + "/databases");
		}
		
		//show content
		setContentView(wb);
	}

}
