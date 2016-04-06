package com.siumrana.badhan16ru;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MBHU extends Activity {
	
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
	
	Activity ac=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mbhu);
		
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
		
		ac=this;
		
		b200.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "mother_box");
				startActivity(in);
			}
			
		});
		
		
		b101.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01983494855"));
				startActivity(cl);
			}
			
		});
		
		b201.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01983494855");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b102.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01754557667"));
				startActivity(cl);
			}
			
		});
		
		b202.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01754557667");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b103.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01723153698"));
				startActivity(cl);
			}
			
		});
		
		b203.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01723153698");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b104.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01774418882"));
				startActivity(cl);
			}
			
		});
		
		b204.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01774418882");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b105.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01768011874"));
				startActivity(cl);
			}
			
		});
		
		b205.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01768011874");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b106.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01733754857 "));
				startActivity(cl);
			}
			
		});
		
		b206.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01733754857");
				startActivity(in);
			}
			
		});
		
		
		
		
		b107.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01751521185"));
				startActivity(cl);
			}
			
		});
		
		b207.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01751521185");
				startActivity(in);
			}
			
		});
		
		
		
		
		b108.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01752097809"));
				startActivity(cl);
			}
			
		});
		
		b208.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01752097809");
				startActivity(in);
			}
			
		});
		
		
		
		
		b109.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01744827150"));
				startActivity(cl);
			}
			
		});
		
		b209.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01744827150");
				startActivity(in);
			}
			
		});
		
		
		
		
		b110.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01743996235"));
				startActivity(cl);
			}
			
		});
		
		b210.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01743996235");
				startActivity(in);
			}
			
		});
		
		
		
		
		b111.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01767638700"));
				startActivity(cl);
			}
			
		});
		
		b211.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01767638700");
				startActivity(in);
			}
			
		});
		
		
		
		
		b112.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01722494745"));
				startActivity(cl);
			}
			
		});
		
		b212.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01722494745");
				startActivity(in);
			}
			
		});
		
		
		
		
		b113.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01738539741"));
				startActivity(cl);
			}
			
		});
		
		b213.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01738539741");
				startActivity(in);
			}
			
		});
		
		
		
		b114.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01689705712"));
				startActivity(cl);
			}
			
		});
		
		b214.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01689705712");
				startActivity(in);
			}
			
		});
		
		
		
		
		b115.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01724932984"));
				startActivity(cl);
			}
			
		});
		
		b215.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01724932984");
				startActivity(in);
			}
			
		});
		
		
		
		
		b116.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01765682791"));
				startActivity(cl);
			}
			
		});
		
		b216.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01765682791");
				startActivity(in);
			}
			
		});
		
		
		
		
		b117.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01767516774"));
				startActivity(cl);
			}
			
		});
		
		b217.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01767516774");
				startActivity(in);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mbhu, menu);
		return true;
	}

}
