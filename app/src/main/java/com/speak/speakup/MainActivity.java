package com.speak.speakup;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button botonPronuncia;
	private Button botonPersonas;
	private Button botonFrecuente;
	public String idioma = Locale.getDefault().getLanguage();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Typeface face = Typeface.createFromAsset(getAssets(),
				"fonts/RobotoCondensed-Regular.ttf");

		botonPronuncia = (Button) findViewById(R.id.button1);
		botonPronuncia.setOnClickListener(this);
		botonPronuncia.setTypeface(face);

		botonPersonas = (Button) findViewById(R.id.button2);
		botonPersonas.setOnClickListener(this);
		botonPersonas.setTypeface(face);

		botonFrecuente = (Button) findViewById(R.id.button3);
		botonFrecuente.setOnClickListener(this);
		botonFrecuente.setTypeface(face);
		
		
}



	public void abrirPersonas() {

		Intent intent = new Intent(MainActivity.this, PersonasActivity.class);
		startActivity(intent);
		overridePendingTransition(R.anim.slide_in_right, R.anim.activity_animation_zoom_out);

	}

	public void abrirFrecuente() {
		Intent intent = new Intent(MainActivity.this, FrecuenteActivity.class);
		startActivity(intent);
	}

	public void abrirPronunciar() {
		Intent intent = new Intent(MainActivity.this, PronunciaActivity.class);
		startActivity(intent);
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.button1:
			abrirPronunciar();
			break;
		case R.id.button2:
			abrirPersonas();
			break;
		case R.id.button3:
			abrirFrecuente();
			break;
		default:
			break;

		}

	}

}
