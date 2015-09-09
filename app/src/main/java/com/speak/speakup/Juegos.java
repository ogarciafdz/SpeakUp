package com.speak.speakup;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class Juegos extends Activity implements OnClickListener {

	private ImageButton Carta;
	private ImageButton Basquet;
	private ImageButton Soccer;
	private ImageButton Arcade;
	private ImageButton Perro;
	MainActivity per = new MainActivity();
	String getIdioma = per.idioma;
	String message;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_juegos);

		Soccer = (ImageButton) findViewById(R.id.JimageButton1);
		Carta = (ImageButton) findViewById(R.id.JimageButton2);
		Arcade = (ImageButton) findViewById(R.id.JimageButton3);
		Basquet = (ImageButton) findViewById(R.id.JimageButton4);
		Perro = (ImageButton) findViewById(R.id.JimageButton5);

		Soccer.setOnClickListener(this);
		Carta.setOnClickListener(this);
		Arcade.setOnClickListener(this);
		Basquet.setOnClickListener(this);
		Perro.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.juegos, menu);
		return true;
	}

	public void botonSoccer() {
		message = getString(R.string.futbol);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.futbol).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.football).start();

		}
	}

	public void botonCarta() {
		message = getString(R.string.cartas);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {

			MediaPlayer.create(this, R.raw.cartas).start();

		} else if (getIdioma.equals("en")) {

			MediaPlayer.create(this, R.raw.poker).start();

		}

	}

	public void botonArcade() {
		message = getString(R.string.videojuegos);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.videojuegos).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.videogames).start();

		}

	}

	public void botonBasquet() {
		message = getString(R.string.basketball);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.baloncesto).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.basketball).start();

		}

	}

	public void perro() {
		message = getString(R.string.perro);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.perro).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.dog).start();

		}

	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.JimageButton1:
			botonSoccer();
			break;
		case R.id.JimageButton2:
			botonCarta();
			break;
		case R.id.JimageButton3:
			botonArcade();
			break;
		case R.id.JimageButton4:
			botonBasquet();
			break;
		case R.id.JimageButton5:
			perro();
			break;
		}
	}

}
