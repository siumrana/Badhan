package com.siumrana.badhan16ru;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SZHRU extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_szhru);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.szhru, menu);
		return true;
	}

}
