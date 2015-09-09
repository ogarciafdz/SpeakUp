package com.speak.speakup;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PronunciaActivity extends Activity implements OnClickListener,
		OnInitListener {

	private TextToSpeech textoRep;
	private int CHECK_CODE = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pronuncia);

		Button EscuchaBoton = (Button) findViewById(R.id.speak);
		EscuchaBoton.setOnClickListener(this);

		Intent verificaIntencion = new Intent();
		verificaIntencion.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
		startActivityForResult(verificaIntencion, CHECK_CODE);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pronuncia, menu);
		return true;
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == CHECK_CODE) {
			if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
				textoRep = new TextToSpeech(this, this);
			} else {
				Intent iniciarTSSIntent = new Intent();
				iniciarTSSIntent
						.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
				startActivity(iniciarTSSIntent);
			}
		}

	}

	private void Hablar(String Speech) {
		textoRep.speak(Speech, TextToSpeech.QUEUE_FLUSH, null);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		EditText introTexto = (EditText) findViewById(R.id.enter);
		String palabras = introTexto.getText().toString();
		Hablar(palabras);

	}

	@Override
	public void onInit(int status) {
		// TODO Auto-generated method stub
		if (status == TextToSpeech.SUCCESS) {
			if (textoRep.isLanguageAvailable(Locale.ROOT) == TextToSpeech.LANG_AVAILABLE)
				textoRep.setLanguage(Locale.ROOT);
		} else if (status == TextToSpeech.ERROR) {
			Toast.makeText(this, "Lo Sentimos Hubo Un ERRORSOTE",
					Toast.LENGTH_LONG);
		}

	}

}
