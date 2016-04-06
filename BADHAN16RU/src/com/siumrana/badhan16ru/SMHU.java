package com.siumrana.badhan16ru;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SMHU extends Activity {
	
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
	Button b112=null;
	Button b113=null;
	Button b114=null;
	Button b115=null;
	Button b116=null;
	Button b117=null;
	Button b118=null;
	Button b119=null;
	Button b120=null;
	
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
	Button b216=null;
	Button b217=null;
	Button b218=null;
	Button b219=null;
	Button b220=null;
	
	Activity ac=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_smhu);
		
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
		b112=(Button) findViewById(R.id.button112);
		b113=(Button) findViewById(R.id.button113);
		b114=(Button) findViewById(R.id.button114);
		b115=(Button) findViewById(R.id.button115);
		b116=(Button) findViewById(R.id.button116);
		b117=(Button) findViewById(R.id.button117);
		b118=(Button) findViewById(R.id.button118);
		b119=(Button) findViewById(R.id.button119);
		b120=(Button) findViewById(R.id.button120);
		
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
		b216=(Button) findViewById(R.id.button216);
		b217=(Button) findViewById(R.id.button217);
		b218=(Button) findViewById(R.id.button218);
		b219=(Button) findViewById(R.id.button219);
		b220=(Button) findViewById(R.id.button220);
		
		ac=this;
		
		
		b200.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "shah_mukdam");
				startActivity(in);
			}
			
		});
		
		
		
		
		b101.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01778385893"));
				startActivity(cl);
			}
			
		});
		
		b201.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01778385893");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b102.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01761280928"));
				startActivity(cl);
			}
			
		});
		
		b202.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01761280928");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b103.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01725617994"));
				startActivity(cl);
			}
			
		});
		
		b203.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01725617994");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b104.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01751090757"));
				startActivity(cl);
			}
			
		});
		
		b204.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01751090757");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b105.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01743348797"));
				startActivity(cl);
			}
			
		});
		
		b205.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01743348797");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b106.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01744750271"));
				startActivity(cl);
			}
			
		});
		
		b206.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01744750271");
				startActivity(in);
			}
			
		});
		
		
		
		
		b107.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01736466995"));
				startActivity(cl);
			}
			
		});
		
		b207.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01736466995");
				startActivity(in);
			}
			
		});
		
		
		
		
		b108.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01755891666"));
				startActivity(cl);
			}
			
		});
		
		b208.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01755891666");
				startActivity(in);
			}
			
		});
		
		
		
		
		b109.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01733847333"));
				startActivity(cl);
			}
			
		});
		
		b209.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01733847333");
				startActivity(in);
			}
			
		});
		
		
		
		
		b110.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01751585687"));
				startActivity(cl);
			}
			
		});
		
		b210.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01751585687");
				startActivity(in);
			}
			
		});
		
		
		
		
		b111.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01736268035"));
				startActivity(cl);
			}
			
		});
		
		b211.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01736268035");
				startActivity(in);
			}
			
		});
		
		
		
		
		b112.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01717729229"));
				startActivity(cl);
			}
			
		});
		
		b212.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01717729229");
				startActivity(in);
			}
			
		});
		
		
		
		
		b113.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01726548349"));
				startActivity(cl);
			}
			
		});
		
		b213.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01726548349");
				startActivity(in);
			}
			
		});
		
		
		
		b114.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel: "));
				startActivity(cl);
			}
			
		});
		
		b214.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "");
				startActivity(in);
			}
			
		});
		
		
		
		
		b115.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel: 01686809385"));
				startActivity(cl);
			}
			
		});
		
		b215.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01686809385");
				startActivity(in);
			}
			
		});
		
		
		
		
		b116.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel: 01796159921"));
				startActivity(cl);
			}
			
		});
		
		b216.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01796159921");
				startActivity(in);
			}
			
		});
		
		
		
		
		b117.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01756512878"));
				startActivity(cl);
			}
			
		});
		
		b217.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01756512878");
				startActivity(in);
			}
			
		});
		
		
		
		b118.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01750804601"));
				startActivity(cl);
			}
			
		});
		
		b218.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01750804601");
				startActivity(in);
			}
			
		});
		
		
		
		b119.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01764445818"));
				startActivity(cl);
			}
			
		});
		
		b219.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01764445818");
				startActivity(in);
			}
			
		});
		
		
		
		
		b120.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01773636165"));
				startActivity(cl);
			}
			
		});
		
		b220.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01773636165");
				startActivity(in);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.smhu, menu);
		return true;
	}

}
