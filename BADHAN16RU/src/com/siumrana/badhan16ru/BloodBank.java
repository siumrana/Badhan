package com.siumrana.badhan16ru;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BloodBank extends Activity {
	
	WebView web=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_blood_bank);
		
		web = (WebView) findViewById(R.id.webView1);
		
		web.getSettings().setJavaScriptEnabled(true);
		
		web.setWebViewClient(new WebViewClient(){
			public boolean shouldOverrideUrlLoading(WebView view,String url){
				view.loadUrl(url);
				return true;
			}
		});
		
		web.loadUrl("http://www.siumrana.com/badhan/blood.php");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.blood_bank, menu);
		return true;
	}

}
