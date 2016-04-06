package com.siumrana.badhan16ru;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class About extends Activity {
	
	Activity ac=null;
	
	Button b1001=null;
	Button b1002=null;
	Button b1003=null;
	Button b1004=null;
	
	Button b1=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		ac=this;
        
        b1001=(Button) findViewById(R.id.button1001);
        b1002=(Button) findViewById(R.id.button1002);
        b1003=(Button) findViewById(R.id.button1003);
        b1004=(Button) findViewById(R.id.button1004);
        
        b1=(Button) findViewById(R.id.button1);
        
        
        b1001.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//Intent in = new Intent(ac,MainActivity.class);
				//startActivity(in);
				finish();
			}
		});
        
        b1002.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,RUZP.class);
				startActivity(in);
				finish();
			}
		});
        
        b1003.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,ByHall.class);
				startActivity(in);
				finish();
			}
		});
        
        b1004.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,PCZ.class);
				startActivity(in);
				finish();
			}
		});
        
        
        
        b1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01740542221"));
				startActivity(cl);
			}
			
		});
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
		return true;
	}

}
