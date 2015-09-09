package com.speak.speakup;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class Otrasfrec extends Activity implements OnClickListener {

	private ImageButton comer;
	private ImageButton beber;
	private ImageButton dormir;
	private ImageButton medicina;
	private ImageButton cambio;
	private ImageButton bano;
	MainActivity per = new MainActivity();
	String getIdioma = per.idioma;
	String message;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_otrasfrec);

		comer = (ImageButton) findViewById(R.id.OimageButton1);
		beber = (ImageButton) findViewById(R.id.OimageButton2);
		dormir = (ImageButton) findViewById(R.id.OimageButton3);
		medicina = (ImageButton) findViewById(R.id.OimageButton4);
		cambio = (ImageButton) findViewById(R.id.OimageButton5);
		bano = (ImageButton) findViewById(R.id.OimageButton6);

		comer.setOnClickListener(this);
		beber.setOnClickListener(this);
		dormir.setOnClickListener(this);
		medicina.setOnClickListener(this);
		cambio.setOnClickListener(this);
		bano.setOnClickListener(this);
	}

	public void comer() {
		message = getString(R.string.comer);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {

			MediaPlayer.create(this, R.raw.comer).start();

		} else if (getIdioma.equals("en")) {

			MediaPlayer.create(this, R.raw.eat).start();

		}

	}

	public void beber() {
		message = getString(R.string.beber);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.beber).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.drink).start();

		}

		Intent intent = new Intent(this, ComidaActivity.class);
		startActivity(intent);

	}

	public void dormir() {
		message = getString(R.string.dormir);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.dormir).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.sleep).start();

		}
	}

	public void medicina() {
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.medicina).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.medicine).start();

		}
	}

	public void cambio() {
		message = getString(R.string.posicion);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.posicion).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.position).start();

		}
		
	}

	public void bano() {
		message = getString(R.string.usarelbano);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.iralbanio).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.toilet).start();

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.otrasfrec, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.OimageButton1:
			comer();
			break;
		case R.id.OimageButton2:
			beber();
			break;
		case R.id.OimageButton3:
			dormir();
			break;
		case R.id.OimageButton4:
			medicina();
			break;
		case R.id.OimageButton5:
			cambio();
			break;
		case R.id.OimageButton6:
			bano();
			break;
		}

	}

}
