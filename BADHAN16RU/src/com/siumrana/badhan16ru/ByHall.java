package com.siumrana.badhan16ru;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ByHall extends Activity {
	
	Button b1001=null;
	Button b1002=null;
	
	Button b1004=null;
	Button b1005=null;
	
	
	Button b101=null;
	Button b102=null;
	Button b103=null;
	Button b104=null;
	Button b105=null;
	Button b106=null;
	Button b107=null;
	Button b108=null;
	Button b109=null;
	Button b110=null;
	Button b111=null;
	
	Button b120=null;
	Button b121=null;
	Button b122=null;
	Button b123=null;
	Button b124=null;
	
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
	
	Button b220=null;
	Button b221=null;
	Button b222=null;
	Button b223=null;
	Button b224=null;

	Activity ac=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_by_hall);
		
		ac=this;
        
        b1001=(Button) findViewById(R.id.button1001);
        b1002=(Button) findViewById(R.id.button1002);
        
        b1004=(Button) findViewById(R.id.button1004);
        b1005=(Button) findViewById(R.id.button1005);
        
        
        b101=(Button) findViewById(R.id.button101);
        b102=(Button) findViewById(R.id.button102);
        b103=(Button) findViewById(R.id.button103);
        b104=(Button) findViewById(R.id.button104);
        b105=(Button) findViewById(R.id.button105);
        b106=(Button) findViewById(R.id.button106);
		b107=(Button) findViewById(R.id.button107);
		b108=(Button) findViewById(R.id.button108);
		b109=(Button) findViewById(R.id.button109);
		b110=(Button) findViewById(R.id.button110);
		b111=(Button) findViewById(R.id.button111);
		
		b120=(Button) findViewById(R.id.button120);
		b121=(Button) findViewById(R.id.button121);
		b122=(Button) findViewById(R.id.button122);
		b123=(Button) findViewById(R.id.button123);
		b124=(Button) findViewById(R.id.button124);
        
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
        
		b220=(Button) findViewById(R.id.button220);
		b221=(Button) findViewById(R.id.button221);
		b222=(Button) findViewById(R.id.button222);
		b223=(Button) findViewById(R.id.button223);
		b224=(Button) findViewById(R.id.button224);
		
        
        
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
        
        b1004.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,PCZ.class);
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
        
        
        
        
        
      
        
               
        
        b101.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SEBHU.class);
				startActivity(in);
			}
		});
        
        b201.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "sher_e_bangla");
				startActivity(in);
			}
			
		});
        

        
        b102.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SMHU.class);
				startActivity(in);
			}
		});
        
        b202.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "shah_mukdam");
				startActivity(in);
			}
			
		});
        
        
        
        
        b103.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,NALHU.class);
				startActivity(in);
			}
		});
        
        b203.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "latif");
				startActivity(in);
			}
		});
        
        

        
        b104.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,AAHU.class);
				startActivity(in);
			}
		});
        
        b204.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "amir_ali");
				startActivity(in);
			}
			
		});
        
          
        
        b105.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SSJHU.class);
				startActivity(in);
			}
		});
        
        b205.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "joha");
				startActivity(in);
			}
			
		});
        
        
        
        b106.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SHRHU.class);
				startActivity(in);
			}
		});
        
        b206.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "hobibur_rahman");
				startActivity(in);
			}
			
		});
        
        
        
        
        b107.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,MHU.class);
				startActivity(in);
			}
		});
        
        b207.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "motihar");
				startActivity(in);
			}
			
		});
        
        
        
        
        b108.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,MBHU.class);
				startActivity(in);
			}
		});
        
        b208.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "mother_box");
				startActivity(in);
			}
			
		});
        
        
        
        
        b109.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SSHU.class);
				startActivity(in);
			}
		});
        
        b209.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "sohraordy");
				startActivity(in);
			}
			
		});
        
        
        
        
        b110.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SZRHU.class);
				startActivity(in);
			}
		});
        
        b210.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "zia");
				startActivity(in);
			}
			
		});
        
        
        
        b111.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,BSMRHU.class);
				startActivity(in);
			}
		});
        
        b211.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "bangobondhu");
				startActivity(in);
			}
			
		});
        
        
        
        b120.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,MuHU.class);
				startActivity(in);
			}
		});
        
        b220.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "munujan");
				startActivity(in);
			}
			
		});
        
        
        
        b121.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,BRHU.class);
				startActivity(in);
			}
		});
        
        b221.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "rokia");
				startActivity(in);
			}
			
		});
        
        
        
        b122.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,TRHU.class);
				startActivity(in);
			}
		});
        
        b222.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "taposi");
				startActivity(in);
			}
			
		});
        
        
        
        b123.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,BKZHU.class);
				startActivity(in);
			}
		});
        
        b223.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "khaleda_zia");
				startActivity(in);
			}
			
		});
        
        
        
        b124.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,RHU.class);
				startActivity(in);
			}
		});
        
        b224.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "rahmotunnesa");
				startActivity(in);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.by_hall, menu);
		return true;
	}

}
