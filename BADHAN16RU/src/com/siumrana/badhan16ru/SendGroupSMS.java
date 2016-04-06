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

public class SendGroupSMS extends Activity {
	
	String gn=null;
	String mess=null;
	
	Button b1=null;
	EditText et=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send_group_sms);
		
		Intent ii=getIntent();
		Bundle bb=ii.getExtras();
		gn=(String) bb.get("gnm");
		
		et=(EditText) findViewById(R.id.editText1);
		b1=(Button) findViewById(R.id.button1);
		
		
		b1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				b1.setClickable(false);
				b1.setText("Please Wait");
				mess=et.getText().toString();
				et.setText("");
				sendMess();
				b1.setText("Ok");
			}
			
		});
		
	}
	
	protected void sendMess() {
		// TODO Auto-generated method stub
		
		if(gn.equals("pahu")){
			SmsManager mngr=SmsManager.getDefault();
			mngr.sendTextMessage("01750331078", null, mess, null, null); // Mamun	zone
			
			mngr.sendTextMessage("01723936595", null, mess, null, null); // robi	motihar
			mngr.sendTextMessage("01750365857", null, mess, null, null); // uzzal	amir ali
			mngr.sendTextMessage("01740837876", null, mess, null, null); // chandan	latif
			mngr.sendTextMessage("01778385893", null, mess, null, null); //ramjan	sm
			mngr.sendTextMessage("01712927981", null, mess, null, null); //mukundo	joha
			mngr.sendTextMessage("01739687883", null, mess, null, null); //nur alam	shorardi
			mngr.sendTextMessage("01983494855", null, mess, null, null); //alamin	mather
			mngr.sendTextMessage("01733104796", null, mess, null, null); //anis		gia
			mngr.sendTextMessage("01773350303", null, mess, null, null); //mosalin	hobibur
			mngr.sendTextMessage("01765903224", null, mess, null, null); //sabu		bangobondhu
			mngr.sendTextMessage("01712843094", null, mess, null, null); //adnan	ser e bangla
			mngr.sendTextMessage("01768757567", null, mess, null, null); //samia	munnu
			mngr.sendTextMessage("01748730916", null, mess, null, null); //sapla	khaleda
			mngr.sendTextMessage("01719417279", null, mess, null, null); //mou		taposi
			mngr.sendTextMessage("01751125118", null, mess, null, null); //roksana	rahmotunnesa
			mngr.sendTextMessage("01773513013", null, mess, null, null); //sanchita	rokia
			
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);	
		}
		
		if(gn.equals("gsahu")){
			SmsManager mngr=SmsManager.getDefault();
			mngr.sendTextMessage("01742799768", null, mess, null, null);// zone
			
			mngr.sendTextMessage("01773151011", null, mess, null, null); // motihar
			mngr.sendTextMessage("01733870947", null, mess, null, null); // amir ali
			mngr.sendTextMessage("01767033374", null, mess, null, null); //	latif
			mngr.sendTextMessage("01751090757", null, mess, null, null); //	sm
			mngr.sendTextMessage("01728553590", null, mess, null, null); //	joha
			mngr.sendTextMessage("01789539450", null, mess, null, null); // shorardi
			mngr.sendTextMessage("01774418882", null, mess, null, null); //	mather
			mngr.sendTextMessage("01720217279", null, mess, null, null); // gia
			mngr.sendTextMessage("01774679986", null, mess, null, null); // hobibur
			mngr.sendTextMessage("01745460303", null, mess, null, null); // bangobondhu
			mngr.sendTextMessage("01727666717", null, mess, null, null); // ser e bangla
			mngr.sendTextMessage("01781009157", null, mess, null, null); // munnu
			mngr.sendTextMessage("01736454623", null, mess, null, null); // khaleda
			mngr.sendTextMessage("01700979752", null, mess, null, null); // taposi
			mngr.sendTextMessage("01759562101", null, mess, null, null); // rahmotunnesa
			mngr.sendTextMessage("01724678696", null, mess, null, null); // rokia
			
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);	
		}
		
		if(gn.equals("zahu")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01748118076", null, mess, null, null); // robi	motihar
			mngr.sendTextMessage("01798183910", null, mess, null, null);  // uzzal	amir ali
			mngr.sendTextMessage("01742799768", null, mess, null, null);  // chandan	latif
			mngr.sendTextMessage("01756512878", null, mess, null, null); //ramjan	sm
			mngr.sendTextMessage("01753226150", null, mess, null, null); //mukundo	joha
			mngr.sendTextMessage("01935258279", null, mess, null, null);  //nur alam	shorardi
			mngr.sendTextMessage("01767516774", null, mess, null, null); //alamin	mather
			mngr.sendTextMessage("01781848756", null, mess, null, null); //anis		gia
			mngr.sendTextMessage("01751664880", null, mess, null, null); //mosalin	hobibur
			mngr.sendTextMessage("01763494504", null, mess, null, null); //sabu		bangobondhu
			mngr.sendTextMessage("01750331078", null, mess, null, null); //adnan	ser e bangla
			mngr.sendTextMessage("01983494294", null, mess, null, null); //samia	munnu
			mngr.sendTextMessage("01794838878", null, mess, null, null); //sapla	khaleda
			mngr.sendTextMessage("01715221782", null, mess, null, null); //mou		taposi
			mngr.sendTextMessage("01735899489", null, mess, null, null); //roksana	rahmotunnesa
			mngr.sendTextMessage("01750883193", null, mess, null, null); //sanchita	rokia
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);	
		}
		
		
		
		
		
		
		
		
		
		if(gn.equals("sher_e_bangla")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01712842094", null, mess, null, null);
			mngr.sendTextMessage("01744643182", null, mess, null, null);
			mngr.sendTextMessage("01724341050", null, mess, null, null);
			mngr.sendTextMessage("01727666717", null, mess, null, null);
			mngr.sendTextMessage("01821799968", null, mess, null, null);
			mngr.sendTextMessage("01717922855", null, mess, null, null);
			mngr.sendTextMessage("01703442033", null, mess, null, null);
			mngr.sendTextMessage("01719930591", null, mess, null, null);
			mngr.sendTextMessage("01745505060", null, mess, null, null);
			mngr.sendTextMessage("01784990135", null, mess, null, null);
			mngr.sendTextMessage("01749820054", null, mess, null, null);
			mngr.sendTextMessage("01741543256", null, mess, null, null);
			mngr.sendTextMessage("01748658332", null, mess, null, null);
			mngr.sendTextMessage("01712918120", null, mess, null, null);
			mngr.sendTextMessage("01750948212", null, mess, null, null);
			mngr.sendTextMessage("01751267007", null, mess, null, null);

			mngr.sendTextMessage("01750331078", null, mess, null, null);

			mngr.sendTextMessage("01929732606", null, mess, null, null);
			mngr.sendTextMessage("01749700927", null, mess, null, null);
			mngr.sendTextMessage("01747862727", null, mess, null, null);
			mngr.sendTextMessage("01716884222", null, mess, null, null);
			mngr.sendTextMessage("01762841212", null, mess, null, null);
			mngr.sendTextMessage("01783660559", null, mess, null, null);
			mngr.sendTextMessage("01762890486", null, mess, null, null);
			mngr.sendTextMessage("01719769368", null, mess, null, null);
			mngr.sendTextMessage("01764794002", null, mess, null, null);
			mngr.sendTextMessage("01747455310", null, mess, null, null);
			mngr.sendTextMessage("01772309729", null, mess, null, null);
			mngr.sendTextMessage("01746406945", null, mess, null, null);
			mngr.sendTextMessage("01744486345", null, mess, null, null);
			mngr.sendTextMessage("01773897382", null, mess, null, null);
			mngr.sendTextMessage("01515695109", null, mess, null, null);
			
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);
		}
		
		
		if(gn.equals("shah_mukdam")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01778385893", null, mess, null, null);
			mngr.sendTextMessage("01761280928", null, mess, null, null);
			mngr.sendTextMessage("01725618798", null, mess, null, null);
			mngr.sendTextMessage("01751090757", null, mess, null, null);
			mngr.sendTextMessage("01743348797", null, mess, null, null);
			mngr.sendTextMessage("01744750271", null, mess, null, null);
			mngr.sendTextMessage("01736866995", null, mess, null, null);
			mngr.sendTextMessage("01755891666", null, mess, null, null);
			mngr.sendTextMessage("01733847333", null, mess, null, null);
			mngr.sendTextMessage("01751585687", null, mess, null, null);
			mngr.sendTextMessage("01736268035", null, mess, null, null);
			mngr.sendTextMessage("01717729229", null, mess, null, null);
			mngr.sendTextMessage("01726588349", null, mess, null, null);
			mngr.sendTextMessage("01686809385", null, mess, null, null);
			mngr.sendTextMessage("01796159921", null, mess, null, null);
			mngr.sendTextMessage("01756512878", null, mess, null, null);

			mngr.sendTextMessage("01750804601", null, mess, null, null);

			mngr.sendTextMessage("01764445818", null, mess, null, null);
			mngr.sendTextMessage("01773636165", null, mess, null, null);
			
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);
		}
		
		
		if(gn.equals("latif")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01740837876", null, mess, null, null);
			mngr.sendTextMessage("01751494969", null, mess, null, null);
			mngr.sendTextMessage("01723253231", null, mess, null, null);
			mngr.sendTextMessage("01767033378", null, mess, null, null);
			mngr.sendTextMessage("01740542221", null, mess, null, null);
			mngr.sendTextMessage("01732568150", null, mess, null, null);
			mngr.sendTextMessage("01743477547", null, mess, null, null);
			mngr.sendTextMessage("01751223321", null, mess, null, null);
			mngr.sendTextMessage("01784350517", null, mess, null, null);
			mngr.sendTextMessage("01751304799", null, mess, null, null);
			mngr.sendTextMessage("01675239653", null, mess, null, null);
			mngr.sendTextMessage("01733790428", null, mess, null, null);
			mngr.sendTextMessage("01757396933", null, mess, null, null);
			mngr.sendTextMessage("01750795595", null, mess, null, null);
			mngr.sendTextMessage("01784078309", null, mess, null, null);
			mngr.sendTextMessage("01793902462", null, mess, null, null);

			mngr.sendTextMessage("01742799768", null, mess, null, null);

			mngr.sendTextMessage("01741317532", null, mess, null, null);
			mngr.sendTextMessage("01740102046", null, mess, null, null);
			mngr.sendTextMessage("01740448320", null, mess, null, null);
			mngr.sendTextMessage("01775904448", null, mess, null, null);
			mngr.sendTextMessage("01758142768", null, mess, null, null);
			mngr.sendTextMessage("01750454545", null, mess, null, null);
			mngr.sendTextMessage("01761064336", null, mess, null, null);
			mngr.sendTextMessage("01738750251", null, mess, null, null);
			
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);
		}
		
		
		if(gn.equals("amir_ali")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01750365857", null, mess, null, null);
			mngr.sendTextMessage("01747555225", null, mess, null, null);
			mngr.sendTextMessage("01750801062", null, mess, null, null);
			mngr.sendTextMessage("01733870947", null, mess, null, null);
			mngr.sendTextMessage("01744201249", null, mess, null, null);
			mngr.sendTextMessage("01710736038", null, mess, null, null);
			mngr.sendTextMessage("01743628027", null, mess, null, null);
			mngr.sendTextMessage("01717182513", null, mess, null, null);
			mngr.sendTextMessage("01768607157", null, mess, null, null);
			mngr.sendTextMessage("01787922342", null, mess, null, null);
			mngr.sendTextMessage("01934281505", null, mess, null, null);
			mngr.sendTextMessage("01738885507", null, mess, null, null);
			mngr.sendTextMessage("01744473297", null, mess, null, null);
			mngr.sendTextMessage("01710260249", null, mess, null, null);
			mngr.sendTextMessage("01753606119", null, mess, null, null);
			mngr.sendTextMessage("01778527584", null, mess, null, null);

			mngr.sendTextMessage("01710400384", null, mess, null, null);

			
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);
		}
		
		
		if(gn.equals("joha")){
			SmsManager mngr=SmsManager.getDefault();
		
		
			
			
			
			
			
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);
		}
			
		if(gn.equals("hobibur_rahman")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01773350303", null, mess, null, null);
			mngr.sendTextMessage("01745453369", null, mess, null, null);
			mngr.sendTextMessage("01753570081", null, mess, null, null);
			mngr.sendTextMessage("01778679986", null, mess, null, null);
			mngr.sendTextMessage("01737164645", null, mess, null, null);
			mngr.sendTextMessage("01521482224", null, mess, null, null);
			mngr.sendTextMessage("01723309230", null, mess, null, null);
			mngr.sendTextMessage("01751005550", null, mess, null, null);
			mngr.sendTextMessage("01738342781", null, mess, null, null);
			mngr.sendTextMessage("01521475526", null, mess, null, null);
			mngr.sendTextMessage("01768854034", null, mess, null, null);
			mngr.sendTextMessage("01828836275", null, mess, null, null);
			mngr.sendTextMessage("01922049290", null, mess, null, null);
			mngr.sendTextMessage("01720190296", null, mess, null, null);
			mngr.sendTextMessage("01749662218", null, mess, null, null);
			mngr.sendTextMessage("01781654442", null, mess, null, null);

			mngr.sendTextMessage("01751664880", null, mess, null, null);

			
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);
		}
		
		if(gn.equals("motihar")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01723936595", null, mess, null, null);
			mngr.sendTextMessage("01723825191", null, mess, null, null);
			mngr.sendTextMessage("01737878455", null, mess, null, null);
			mngr.sendTextMessage("01773151011", null, mess, null, null);
			mngr.sendTextMessage("01741476876", null, mess, null, null);
			mngr.sendTextMessage("01722087833", null, mess, null, null);
			mngr.sendTextMessage("01793044990", null, mess, null, null);
			mngr.sendTextMessage("01935263773", null, mess, null, null);
			mngr.sendTextMessage("01521500726", null, mess, null, null);
			mngr.sendTextMessage("01756600815", null, mess, null, null);
			mngr.sendTextMessage("01764073098", null, mess, null, null);
			mngr.sendTextMessage("01767229034", null, mess, null, null);
			mngr.sendTextMessage("01797760011", null, mess, null, null);
			mngr.sendTextMessage("01774273005", null, mess, null, null);
			mngr.sendTextMessage("01731711910", null, mess, null, null);
			
			mngr.sendTextMessage("01748118076", null, mess, null, null);

			mngr.sendTextMessage("01723769283", null, mess, null, null);
			mngr.sendTextMessage("01745999832", null, mess, null, null);
			
			Toast.makeText(getApplicationContext(), "send successfull", 1);
		}
		
		if(gn.equals("mother_box")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01983494855", null, mess, null, null);
			mngr.sendTextMessage("01754557667", null, mess, null, null);
			mngr.sendTextMessage("01723153698", null, mess, null, null);
			mngr.sendTextMessage("01778418882", null, mess, null, null);
			mngr.sendTextMessage("01768011874", null, mess, null, null);
			mngr.sendTextMessage("01733755457", null, mess, null, null);
			mngr.sendTextMessage("01751521185", null, mess, null, null);
			mngr.sendTextMessage("01752097809", null, mess, null, null);
			mngr.sendTextMessage("01744827150", null, mess, null, null);
			mngr.sendTextMessage("01743996235", null, mess, null, null);
			mngr.sendTextMessage("01767638700", null, mess, null, null);
			mngr.sendTextMessage("01722494745", null, mess, null, null);
			mngr.sendTextMessage("01738539741", null, mess, null, null);
			mngr.sendTextMessage("01689705712", null, mess, null, null);
			mngr.sendTextMessage("01728932984", null, mess, null, null);
			mngr.sendTextMessage("01765682791", null, mess, null, null);

			mngr.sendTextMessage("01767516778", null, mess, null, null);

			Toast.makeText(getApplicationContext(), "send successfull", 1);
		}
		
		if(gn.equals("sohraordy")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01739687883", null, mess, null, null);
			mngr.sendTextMessage("01773371378", null, mess, null, null);
			mngr.sendTextMessage("01750010318", null, mess, null, null);
			mngr.sendTextMessage("01789539450", null, mess, null, null);
			mngr.sendTextMessage("01737766837", null, mess, null, null);
			mngr.sendTextMessage("01920862598", null, mess, null, null);
			mngr.sendTextMessage("01703369702", null, mess, null, null);
			mngr.sendTextMessage("01737879430", null, mess, null, null);
			mngr.sendTextMessage("01717243756", null, mess, null, null);
			mngr.sendTextMessage("01753474401", null, mess, null, null);
			mngr.sendTextMessage("01789489951", null, mess, null, null);
			mngr.sendTextMessage("01770825790", null, mess, null, null);
			mngr.sendTextMessage("01751245272", null, mess, null, null);
			mngr.sendTextMessage("01746484435", null, mess, null, null);
			mngr.sendTextMessage("01706374448", null, mess, null, null);
			mngr.sendTextMessage("01748154707", null, mess, null, null);

			mngr.sendTextMessage("01792902150", null, mess, null, null);

			mngr.sendTextMessage("01714257427", null, mess, null, null);
			mngr.sendTextMessage("01911050365", null, mess, null, null);
			mngr.sendTextMessage("01795110898", null, mess, null, null);
				
			Toast.makeText(getApplicationContext(), "send successfull", 1);
		}
		
		if(gn.equals("zia")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01733104796", null, mess, null, null);
			mngr.sendTextMessage("01737145378", null, mess, null, null);
			mngr.sendTextMessage("01745328240", null, mess, null, null);
			mngr.sendTextMessage("01720217279", null, mess, null, null);
			mngr.sendTextMessage("01754800601", null, mess, null, null);
			mngr.sendTextMessage("01745620863", null, mess, null, null);
			mngr.sendTextMessage("01756500335", null, mess, null, null);
			mngr.sendTextMessage("01754515077", null, mess, null, null);
			mngr.sendTextMessage("01719330324", null, mess, null, null);
			mngr.sendTextMessage("01751255480", null, mess, null, null);
			mngr.sendTextMessage("01945300292", null, mess, null, null);
			mngr.sendTextMessage("01797760182", null, mess, null, null);
			mngr.sendTextMessage("01830769338", null, mess, null, null);
			mngr.sendTextMessage("01722015630", null, mess, null, null);
			mngr.sendTextMessage("01790192495", null, mess, null, null);
			mngr.sendTextMessage("01752615766", null, mess, null, null);

			mngr.sendTextMessage("01829674037", null, mess, null, null);

			mngr.sendTextMessage("01780804468", null, mess, null, null);
			//mngr.sendTextMessage("", null, mess, null, null);
			mngr.sendTextMessage("01761089877", null, mess, null, null);
			mngr.sendTextMessage("01793450989", null, mess, null, null);
			mngr.sendTextMessage("01765926914", null, mess, null, null);
			mngr.sendTextMessage("01712417702", null, mess, null, null);
			mngr.sendTextMessage("01723325005", null, mess, null, null);
			mngr.sendTextMessage("01744880984", null, mess, null, null);
			mngr.sendTextMessage("01733407010", null, mess, null, null);
			mngr.sendTextMessage("01747252809", null, mess, null, null);
			mngr.sendTextMessage("01757144992", null, mess, null, null);
			mngr.sendTextMessage("01799499899", null, mess, null, null);
			
			Toast.makeText(getApplicationContext(), "send successfull", 1);
		}
		
		if(gn.equals("bangobondhu")){
			SmsManager mngr=SmsManager.getDefault();
			mngr.sendTextMessage("01765903224", null, mess, null, null);
			mngr.sendTextMessage("01767783733", null, mess, null, null);
			mngr.sendTextMessage("01785493499", null, mess, null, null);
			mngr.sendTextMessage("01745460303", null, mess, null, null);
			mngr.sendTextMessage("01773507864", null, mess, null, null);
			mngr.sendTextMessage("01722087833", null, mess, null, null);
			mngr.sendTextMessage("01715691682", null, mess, null, null);
			mngr.sendTextMessage("01776544682", null, mess, null, null);
			mngr.sendTextMessage("01767086381", null, mess, null, null);
			mngr.sendTextMessage("01718504703", null, mess, null, null);
			mngr.sendTextMessage("01793889188", null, mess, null, null);
			mngr.sendTextMessage("01766329995", null, mess, null, null);
			mngr.sendTextMessage("01762866423", null, mess, null, null);
			mngr.sendTextMessage("01746734384", null, mess, null, null);
			mngr.sendTextMessage("01738662633", null, mess, null, null);
			
			mngr.sendTextMessage("01763494504", null, mess, null, null);
			
			mngr.sendTextMessage("01737740151", null, mess, null, null);
			mngr.sendTextMessage("01767100120", null, mess, null, null);
			mngr.sendTextMessage("01714721156", null, mess, null, null);
			mngr.sendTextMessage("01737997994", null, mess, null, null);
			mngr.sendTextMessage("01733412754", null, mess, null, null);
			mngr.sendTextMessage("01762639042", null, mess, null, null);
			mngr.sendTextMessage("01797772407", null, mess, null, null);
			mngr.sendTextMessage("01773032677", null, mess, null, null);
			mngr.sendTextMessage("01763252618", null, mess, null, null);
			mngr.sendTextMessage("01837000994", null, mess, null, null);
			mngr.sendTextMessage("01833034557", null, mess, null, null);
			mngr.sendTextMessage("01717564362", null, mess, null, null);
			mngr.sendTextMessage("01740106868", null, mess, null, null);
			mngr.sendTextMessage("01723076340", null, mess, null, null);
			mngr.sendTextMessage("01625290167", null, mess, null, null);
			mngr.sendTextMessage("01738160366", null, mess, null, null);
			mngr.sendTextMessage("01740215462", null, mess, null, null);
			mngr.sendTextMessage("01938134363", null, mess, null, null);
		
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);
		}
		
		
		
		if(gn.equals("munujan")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01768757567", null, mess, null, null);
			mngr.sendTextMessage("01742866203", null, mess, null, null);
			mngr.sendTextMessage("01798837974", null, mess, null, null);
			mngr.sendTextMessage("01781009157", null, mess, null, null);
			mngr.sendTextMessage("01776960066", null, mess, null, null);
			mngr.sendTextMessage("01788122698", null, mess, null, null);
			mngr.sendTextMessage("01722534448", null, mess, null, null);
			mngr.sendTextMessage("01722885737", null, mess, null, null);
			mngr.sendTextMessage("01710000675", null, mess, null, null);
			mngr.sendTextMessage("01780986577", null, mess, null, null);
			mngr.sendTextMessage("01792568938", null, mess, null, null);
			mngr.sendTextMessage("01746734949", null, mess, null, null);
			mngr.sendTextMessage("01710437293", null, mess, null, null);
			mngr.sendTextMessage("01986232268", null, mess, null, null);
			mngr.sendTextMessage("01761110388", null, mess, null, null);
			
			mngr.sendTextMessage("01983494298", null, mess, null, null);
			
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);
		}
		
		if(gn.equals("rokia")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01773513013", null, mess, null, null);
			mngr.sendTextMessage("01750497339", null, mess, null, null);
			mngr.sendTextMessage("01785491140", null, mess, null, null);
			mngr.sendTextMessage("01724678696", null, mess, null, null);
			mngr.sendTextMessage("01766176471", null, mess, null, null);
			mngr.sendTextMessage("01742450515", null, mess, null, null);
			mngr.sendTextMessage("01780906845", null, mess, null, null);
			mngr.sendTextMessage("01747525880", null, mess, null, null);
			mngr.sendTextMessage("01789346929", null, mess, null, null);
			mngr.sendTextMessage("01738399019", null, mess, null, null);
			mngr.sendTextMessage("01764865154", null, mess, null, null);
			mngr.sendTextMessage("01773008077", null, mess, null, null);
			mngr.sendTextMessage("01681238602", null, mess, null, null);
			mngr.sendTextMessage("01790362679", null, mess, null, null);
			mngr.sendTextMessage("01773268397", null, mess, null, null);
			mngr.sendTextMessage("01773545776", null, mess, null, null);

			mngr.sendTextMessage("01750883193", null, mess, null, null);

			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);
		}
		
		
		if(gn.equals("taposi")){
			SmsManager mngr=SmsManager.getDefault();
		
			mngr.sendTextMessage("01719417279", null, mess, null, null);
			mngr.sendTextMessage("01795222310", null, mess, null, null);
			mngr.sendTextMessage("01755465340", null, mess, null, null);
			mngr.sendTextMessage("01700979752", null, mess, null, null);
			mngr.sendTextMessage("01755765677", null, mess, null, null);
			mngr.sendTextMessage("01757253166", null, mess, null, null);
			mngr.sendTextMessage("01774272887", null, mess, null, null);
			mngr.sendTextMessage("01918617004", null, mess, null, null);
			mngr.sendTextMessage("01792894300", null, mess, null, null);
			mngr.sendTextMessage("01706794308", null, mess, null, null);
			mngr.sendTextMessage("01721700317", null, mess, null, null);
			mngr.sendTextMessage("01762439362", null, mess, null, null);
			mngr.sendTextMessage("01933840701", null, mess, null, null);
			mngr.sendTextMessage("01765497889", null, mess, null, null);
			mngr.sendTextMessage("01741388622", null, mess, null, null);
			mngr.sendTextMessage("01712704969", null, mess, null, null);
			mngr.sendTextMessage("01715221781", null, mess, null, null);
			mngr.sendTextMessage("01789077166", null, mess, null, null);
			mngr.sendTextMessage("01788058698", null, mess, null, null);
			mngr.sendTextMessage("01780331665", null, mess, null, null);
			mngr.sendTextMessage("01779603346", null, mess, null, null);
			mngr.sendTextMessage("01732445192", null, mess, null, null);
			mngr.sendTextMessage("01767002717", null, mess, null, null);
			mngr.sendTextMessage("01731066824", null, mess, null, null);
			mngr.sendTextMessage("01724106294", null, mess, null, null);
			mngr.sendTextMessage("01714517214", null, mess, null, null);
			mngr.sendTextMessage("01733764506", null, mess, null, null);
			mngr.sendTextMessage("01746904726", null, mess, null, null);
			mngr.sendTextMessage("01723319760", null, mess, null, null);
			mngr.sendTextMessage("01796173250", null, mess, null, null);
			mngr.sendTextMessage("01748522184", null, mess, null, null);
			mngr.sendTextMessage("01723294677", null, mess, null, null);
			mngr.sendTextMessage("01778237456", null, mess, null, null);
			mngr.sendTextMessage("01521479606", null, mess, null, null);
			mngr.sendTextMessage("01717510096", null, mess, null, null);
			mngr.sendTextMessage("01713709610", null, mess, null, null);
			mngr.sendTextMessage("01740053663", null, mess, null, null);
			mngr.sendTextMessage("01778547060", null, mess, null, null);
			mngr.sendTextMessage("01780472462", null, mess, null, null);
			mngr.sendTextMessage("01743453196", null, mess, null, null);
			mngr.sendTextMessage("01741388622", null, mess, null, null);
			mngr.sendTextMessage("01787204062", null, mess, null, null);
			mngr.sendTextMessage("01768994748", null, mess, null, null);
			mngr.sendTextMessage("01751392130", null, mess, null, null);
			mngr.sendTextMessage("01798591306", null, mess, null, null);
			mngr.sendTextMessage("01738223410", null, mess, null, null);
			mngr.sendTextMessage("01765001946", null, mess, null, null);
			mngr.sendTextMessage("01717013255", null, mess, null, null);
			mngr.sendTextMessage("01743218718", null, mess, null, null);
			mngr.sendTextMessage("01783254800", null, mess, null, null);
			mngr.sendTextMessage("01740110628", null, mess, null, null);
			mngr.sendTextMessage("01781373596", null, mess, null, null);
			
			
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);
		}
		
		
		if(gn.equals("khaleda_zia")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01748730916", null, mess, null, null);
			mngr.sendTextMessage("01797837100", null, mess, null, null);
			mngr.sendTextMessage("01770117271", null, mess, null, null);
			mngr.sendTextMessage("01736454623", null, mess, null, null);
			mngr.sendTextMessage("01748092525", null, mess, null, null);
			mngr.sendTextMessage("01776644422", null, mess, null, null);
			mngr.sendTextMessage("01755178424", null, mess, null, null);
			mngr.sendTextMessage("01770703075", null, mess, null, null);
			mngr.sendTextMessage("01926951506", null, mess, null, null);
			mngr.sendTextMessage("01739870895", null, mess, null, null);
			mngr.sendTextMessage("01948107628", null, mess, null, null);
			mngr.sendTextMessage("01784961454", null, mess, null, null);
			mngr.sendTextMessage("01774416086", null, mess, null, null);
			mngr.sendTextMessage("01743449363", null, mess, null, null);
			mngr.sendTextMessage("01949300385", null, mess, null, null);
			mngr.sendTextMessage("01729688938", null, mess, null, null);

			mngr.sendTextMessage("01794838878", null, mess, null, null);
		
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);
		}
		
		
		if(gn.equals("rahmotunnesa")){
			SmsManager mngr=SmsManager.getDefault();
			
			mngr.sendTextMessage("01751125118", null, mess, null, null);
			mngr.sendTextMessage("01925409588", null, mess, null, null);
			mngr.sendTextMessage("01728792663", null, mess, null, null);
			mngr.sendTextMessage("01759562101", null, mess, null, null);
			mngr.sendTextMessage("01782692931", null, mess, null, null);
			mngr.sendTextMessage("01748362173", null, mess, null, null);
			mngr.sendTextMessage("01706676869", null, mess, null, null);
			mngr.sendTextMessage("01793688048", null, mess, null, null);
			mngr.sendTextMessage("01774694021", null, mess, null, null);
			mngr.sendTextMessage("01769922259", null, mess, null, null);
			mngr.sendTextMessage("01723386801", null, mess, null, null);
			mngr.sendTextMessage("01948077421", null, mess, null, null);
			mngr.sendTextMessage("01740390055", null, mess, null, null);
			mngr.sendTextMessage("01786461481", null, mess, null, null);
			mngr.sendTextMessage("01755339868", null, mess, null, null);
			mngr.sendTextMessage("01723702561", null, mess, null, null);
			
			mngr.sendTextMessage("01735899889", null, mess, null, null);
			
			mngr.sendTextMessage("01781357893", null, mess, null, null);
			mngr.sendTextMessage("01772105072", null, mess, null, null);
			mngr.sendTextMessage("01770459136", null, mess, null, null);
			mngr.sendTextMessage("01723702561", null, mess, null, null);
			mngr.sendTextMessage("01751148318", null, mess, null, null);
			mngr.sendTextMessage("01737603115", null, mess, null, null);
			mngr.sendTextMessage("01787535168", null, mess, null, null);
			mngr.sendTextMessage("01744946004", null, mess, null, null);
			mngr.sendTextMessage("01726920611", null, mess, null, null);
			mngr.sendTextMessage("01773312442", null, mess, null, null);
			mngr.sendTextMessage("01778908666", null, mess, null, null);
			mngr.sendTextMessage("01767241067", null, mess, null, null);
			mngr.sendTextMessage("01935597148", null, mess, null, null);
			mngr.sendTextMessage("01767244520", null, mess, null, null);
			
			Toast.makeText(getApplicationContext(), "sendsuccessfull", 1);
		}
		
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.send_group_sm, menu);
		return true;
	}

}
