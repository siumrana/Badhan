package com.siumrana.badhan16ru;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendingSMS extends Activity {
	
	String no=null;
	String mess=null;
	
	Button b1=null;
	EditText et=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sending_sms);
		
		Intent ii=getIntent();
		Bundle bb=ii.getExtras();
		no=(String) bb.get("mno");
		
		et=(EditText) findViewById(R.id.editText1);
		b1=(Button) findViewById(R.id.button1);
		
		
		b1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				sendMess();
				et.setText("");
				b1.setText("OK");
				b1.setClickable(false);
			}
			
		});
	}
	
	protected void sendMess() {
		
		
		// TODO Auto-generated method stub
		mess=et.getText().toString();
		
		SmsManager mngr=SmsManager.getDefault();
		mngr.sendTextMessage(no, null, mess, null, null);
		
		Toast.makeText(getApplicationContext(), "sendsuccessfull", Toast.LENGTH_LONG).show();
			
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sending_sm, menu);
		return true;
	}

}
