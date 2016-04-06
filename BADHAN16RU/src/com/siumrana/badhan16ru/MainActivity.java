package com.siumrana.badhan16ru;



import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	
Activity ac=null;
	
	
	Button b1002=null;
	Button b1003=null;
	Button b1004=null;
	Button b1005=null;
	
	Button b100=null;
	Button b101=null;
	Button b102=null;
	Button b103=null;
	Button b104=null;
	Button b105=null;
	Button b106=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 ac=this;
	        
	        b1002=(Button) findViewById(R.id.button1002);
	        b1003=(Button) findViewById(R.id.button1003);
	        b1004=(Button) findViewById(R.id.button1004);
	        b1005=(Button) findViewById(R.id.button1005);
	        
	        
	        //b100=(Button) findViewById(R.id.button100);
	        b101=(Button) findViewById(R.id.button101);
	        b102=(Button) findViewById(R.id.button102);
	        b103=(Button) findViewById(R.id.button103);
	        b104=(Button) findViewById(R.id.button104);
	        b105=(Button) findViewById(R.id.button105);
	        b106=(Button) findViewById(R.id.button106);
	        
	        
	        
	        b1002.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent in = new Intent(ac,RUZP.class);
					startActivity(in);
				}
			});
	        
	        b1003.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent in = new Intent(ac,ByHall.class);
					startActivity(in);
				}
			});
	        
	        b1004.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent in = new Intent(ac,PCZ.class);
					startActivity(in);
				}
			});
	        
	        b1005.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent in = new Intent(ac,About.class);
					startActivity(in);
				}
			});
	        
	            
	        
	        
	        b101.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent in = new Intent(ac,BloodBank.class);
					startActivity(in);
				}
			});

	        b102.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent in = new Intent(ac,ParsonalStock.class);
					startActivity(in);
				}
			});
	        
	        b103.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent in = new Intent(ac,Register.class);
					startActivity(in);
				}
			});

	        b104.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent in = new Intent(ac,Help.class);
					startActivity(in);
				}
			});
	        
	        b105.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent in = new Intent(ac,RecentEvent.class);
					startActivity(in);
				}
			});
	        
	        b106.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent in = new Intent(ac,WebSite.class);
					startActivity(in);
				}
			});

		
	}

	
	
	@Override
		public void onBackPressed() {
			// TODO Auto-generated method stub
			createDialog();
		}
	
	
	private void createDialog() {
		// TODO Auto-generated method stub
		
		AlertDialog.Builder alertDig = new  AlertDialog.Builder(this);
		alertDig.setMessage("Are you sure, you want to exit?");
		//alertDig.setCancelable(false);
		
		alertDig.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				MainActivity.super.onBackPressed();	
			}
			
		});
		
		 
		
		alertDig.setNegativeButton("No", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				
				
			}
		});
		
		alertDig.create().show();
		
		
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
