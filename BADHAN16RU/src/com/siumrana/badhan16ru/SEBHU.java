package com.siumrana.badhan16ru;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SEBHU extends Activity {
	
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
	Button b121=null;
	Button b122=null;
	Button b123=null;
	Button b124=null;
	Button b125=null;
	Button b126=null;
	Button b127=null;
	Button b128=null;
	Button b129=null;
	Button b130=null;
	Button b131=null;
	Button b132=null;
	
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
	Button b221=null;
	Button b222=null;
	Button b223=null;
	Button b224=null;
	Button b225=null;
	Button b226=null;
	Button b227=null;
	Button b228=null;
	Button b229=null;
	Button b230=null;
	Button b231=null;
	Button b232=null;
	
	Activity ac=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sebhu);
		
		b200=(Button) findViewById(R.id.button200);
		
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
		b121=(Button) findViewById(R.id.button121);
		b122=(Button) findViewById(R.id.button122);
		b123=(Button) findViewById(R.id.button123);
		b124=(Button) findViewById(R.id.button124);
		b125=(Button) findViewById(R.id.button125);
		b126=(Button) findViewById(R.id.button126);
		b127=(Button) findViewById(R.id.button127);
		b128=(Button) findViewById(R.id.button128);
		b129=(Button) findViewById(R.id.button129);
		b130=(Button) findViewById(R.id.button130);
		b131=(Button) findViewById(R.id.button131);
		b132=(Button) findViewById(R.id.button132);
		
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
		b221=(Button) findViewById(R.id.button221);
		b222=(Button) findViewById(R.id.button222);
		b223=(Button) findViewById(R.id.button223);
		b224=(Button) findViewById(R.id.button224);
		b225=(Button) findViewById(R.id.button225);
		b226=(Button) findViewById(R.id.button226);
		b227=(Button) findViewById(R.id.button227);
		b228=(Button) findViewById(R.id.button228);
		b229=(Button) findViewById(R.id.button229);
		b230=(Button) findViewById(R.id.button230);
		b231=(Button) findViewById(R.id.button231);
		b232=(Button) findViewById(R.id.button232);
		
		ac=this;
		
		
		b200.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendGroupSMS.class);
				in.putExtra("gnm", "sher_e_bangla");
				startActivity(in);
			}
			
		});
		
		
		
		b101.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01712842094"));
				startActivity(cl);
			}
			
		});
		
		b201.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01712842094");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b102.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01744643182"));
				startActivity(cl);
			}
			
		});
		
		b202.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01744643182");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b103.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01724341050"));
				startActivity(cl);
			}
			
		});
		
		b203.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01724341050");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b104.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01727666717"));
				startActivity(cl);
			}
			
		});
		
		b204.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01727666717");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b105.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01821799968"));
				startActivity(cl);
			}
			
		});
		
		b205.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01821799968");
				startActivity(in);
			}
			
		});
		
		
		
		
		
		b106.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01717922855"));
				startActivity(cl);
			}
			
		});
		
		b206.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01717922855");
				startActivity(in);
			}
			
		});
		
		
		
		
		b107.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01703442033"));
				startActivity(cl);
			}
			
		});
		
		b207.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01703442033");
				startActivity(in);
			}
			
		});
		
		
		
		
		b108.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01719930591"));
				startActivity(cl);
			}
			
		});
		
		b208.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01719930591");
				startActivity(in);
			}
			
		});
		
		
		
		
		b109.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01745505060"));
				startActivity(cl);
			}
			
		});
		
		b209.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01745505060");
				startActivity(in);
			}
			
		});
		
		
		
		
		b110.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01784990135"));
				startActivity(cl);
			}
			
		});
		
		b210.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01784990135");
				startActivity(in);
			}
			
		});
		
		
		
		
		b111.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01749820054"));
				startActivity(cl);
			}
			
		});
		
		b211.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01749820054");
				startActivity(in);
			}
			
		});
		
		
		
		
		b112.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01741543256"));
				startActivity(cl);
			}
			
		});
		
		b212.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01741543256");
				startActivity(in);
			}
			
		});
		
		
		
		
		b113.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01748658332"));
				startActivity(cl);
			}
			
		});
		
		b213.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01748658332");
				startActivity(in);
			}
			
		});
		
		
		
		b114.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01712918120"));
				startActivity(cl);
			}
			
		});
		
		b214.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01712918120");
				startActivity(in);
			}
			
		});
		
		
		
		
		b115.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01750948212"));
				startActivity(cl);
			}
			
		});
		
		b215.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01750948212");
				startActivity(in);
			}
			
		});
		
		
		
		
		b116.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01751267007"));
				startActivity(cl);
			}
			
		});
		
		b216.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01751267007");
				startActivity(in);
			}
			
		});
		
		
		
		
		b117.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01750331078"));
				startActivity(cl);
			}
			
		});
		
		b217.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01750331078");
				startActivity(in);
			}
			
		});
		
		
		
		b118.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01929732606"));
				startActivity(cl);
			}
			
		});
		
		b218.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01929732606");
				startActivity(in);
			}
			
		});
		
		
		
		b119.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01749700927"));
				startActivity(cl);
			}
			
		});
		
		b219.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01749700927");
				startActivity(in);
			}
			
		});
		
		
		
		
		b120.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01747862727"));
				startActivity(cl);
			}
			
		});
		
		b220.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01747862727");
				startActivity(in);
			}
			
		});
		
		
		
		b121.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01716884222"));
				startActivity(cl);
			}
			
		});
		
		b221.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01716884222");
				startActivity(in);
			}
			
		});
		
		
		
		
		b122.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01762841212"));
				startActivity(cl);
			}
			
		});
		
		b222.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01762841212");
				startActivity(in);
			}
			
		});
		
		
		
		b123.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01783660559"));
				startActivity(cl);
			}
			
		});
		
		b223.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01783660559");
				startActivity(in);
			}
			
		});
		
		
		
		b124.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01762890486"));
				startActivity(cl);
			}
			
		});
		
		b224.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01762890486");
				startActivity(in);
			}
			
		});
		
		
		
		b125.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01719769368"));
				startActivity(cl);
			}
			
		});
		
		b225.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01719769368");
				startActivity(in);
			}
			
		});

		
		b126.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01764794002"));
				startActivity(cl);
			}
			
		});
		
		b226.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01764794002");
				startActivity(in);
			}
			
		});

		
		b127.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01747455310"));
				startActivity(cl);
			}
			
		});
		
		b227.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01747455310");
				startActivity(in);
			}
			
		});
		
		
		b128.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01772309729"));
				startActivity(cl);
			}
			
		});
		
		b228.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01772309729");
				startActivity(in);
			}
			
		});
		

		b129.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01746406945"));
				startActivity(cl);
			}
			
		});
		
		b229.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01746406945");
				startActivity(in);
			}
			
		});
		
		
		b130.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01744486345"));
				startActivity(cl);
			}
			
		});
		
		b230.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01744486345");
				startActivity(in);
			}
			
		});
		
		
		b131.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01773897382"));
				startActivity(cl);
			}
			
		});
		
		b231.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01773897382");
				startActivity(in);
			}
			
		});
		
		
		b132.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cl=new Intent(Intent.ACTION_CALL);
				cl.setData(Uri.parse("tel:01515695109"));
				startActivity(cl);
			}
			
		});
		
		b232.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(ac,SendingSMS.class);
				in.putExtra("mno", "01515695109");
				startActivity(in);
			}
			
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sebhu, menu);
		return true;
	}

}
