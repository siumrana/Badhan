package com.siumrana.badhan16ru;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PCZ extends Activity {
	
Activity ac=null;
	
	Button b1001=null;
	Button b1002=null;
	Button b1003=null;
	
	Button b1005=null;
	
	
	Button b200=null;
	
	Button b201=null;
	Button b202=null;
	Button b203=null;
	Button b204=null;
	Button b205=null;
	Button b206=null;
	Button b207=null;
	Button b208=null;
	Button b209=null;
	Button b210=null;
	Button b211=null;
	Button b212=null;
	Button b213=null;
	Button b214=null;
	Button b215=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pcz);
		
		ac=this;
		
		b1001=(Button) findViewById(R.id.button1001);
		b1002=(Button) findViewById(R.id.button1002);
		b1003=(Button) findViewById(R.id.button1003);
		
		b1005=(Button) findViewById(R.id.button1005);
		
		
		b200=(Button) findViewById(R.id.button200);
		
		b201=(Button) findViewById(R.id.button201);
		b202=(Button) findViewById(R.id.button202);
		b203=(Button) findViewById(R.id.button203);
		b204=(Button) findViewById(R.id.button204);
		b205=(Button) findViewById(R.id.button205);
		b206=(Button) findViewById(R.id.button206);
		b207=(Button) findViewById(R.id.button207);
		b208=(Button) findViewById(R.id.button208);
		b209=(Button) findViewById(R.id.button209);
		b210=(Button) findViewById(R.id.button210);
		b211=(Button) findViewById(R.id.button211);
		b212=(Button) findViewById(R.id.button212);
		b213=(Button) findViewById(R.id.button213);
		b214=(Button) findViewById(R.id.button214);
		b215=(Button) findViewById(R.id.button215);
		
		
		
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
		
		
		b1005.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,About.class);
				startActivity(in);
				finish();
			}
		});
		
		
		
		
		
		b201.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "pahu");
				startActivity(in);
			}
			
		});
		
		b204.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "gsahu");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		b213.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "zahu");
				startActivity(in);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pcz, menu);
		return true;
	}

}
