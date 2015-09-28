package com.speak.speakup;

import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PronunciaActivity extends Activity  {

	TextToSpeech t1;
	EditText ed1;
	Button b1;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pronuncia);

		ed1=(EditText)findViewById(R.id.enter);
		b1=(Button)findViewById(R.id.speak);

		t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
			@Override
			public void onInit(int status) {
				if(status != TextToSpeech.ERROR) {
					t1.setLanguage(Locale.ROOT);
				}
			}
		});

		b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String toSpeak = ed1.getText().toString();
				Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
				t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
			}
		});


	}


	public void onPause(){
		if(t1 !=null){
			t1.stop();
			t1.shutdown();
		}
		super.onPause();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pronuncia, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.

		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}
