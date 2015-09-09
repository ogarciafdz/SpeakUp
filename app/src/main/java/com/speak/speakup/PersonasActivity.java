package com.speak.speakup;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class PersonasActivity extends Activity implements OnClickListener {

	private ImageButton papa;
	private ImageButton mama;
	private ImageButton maestro;
	private ImageButton maestra;
	private ImageButton abuela;
	private ImageButton abuelo;
	private ImageButton amigo;
	private ImageButton amiga;
	private ImageButton hermano;
	private ImageButton hermana;

	private Button botonPuedo;
	private Button botonUsar;
	private Button botonComer;
	private Button botonJugar;
	private Button botonActividad;
	MainActivity per = new MainActivity();
	String getIdioma = per.idioma;
	String message;

	public static final boolean mCheckbox = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_personas);
		Typeface face = Typeface.createFromAsset(getAssets(),
				"fonts/RobotoCondensed-Regular.ttf");

		botonPuedo = (Button) findViewById(R.id.puedo);
		botonUsar = (Button) findViewById(R.id.usar);
		botonComer = (Button) findViewById(R.id.comer);
		botonJugar = (Button) findViewById(R.id.jugar);
		botonActividad = (Button) findViewById(R.id.actividad);

		botonPuedo.setTypeface(face);
		botonUsar.setTypeface(face);
		botonComer.setTypeface(face);
		botonJugar.setTypeface(face);
		botonActividad.setTypeface(face);

		 papa = (ImageButton) findViewById(R.id.papa);
		 mama = (ImageButton) findViewById(R.id.mama);
		 maestra = (ImageButton) findViewById(R.id.maestra);
		 maestro = (ImageButton) findViewById(R.id.maestro);
		 abuelo = (ImageButton) findViewById(R.id.abuelo);
		 abuela = (ImageButton) findViewById(R.id.abuela);
		 amigo = (ImageButton) findViewById(R.id.amigo);
		 amiga = (ImageButton) findViewById(R.id.amiga);
		 hermana = (ImageButton) findViewById(R.id.hermana);
		 hermano = (ImageButton) findViewById(R.id.hermano);

		 botonPuedo.setOnClickListener(this);
		 botonUsar.setOnClickListener(this);
		 botonComer.setOnClickListener(this);
		 botonJugar.setOnClickListener(this);
		 botonActividad.setOnClickListener(this);
		 papa.setOnClickListener(this);
		 mama.setOnClickListener(this);
		 maestra.setOnClickListener(this);
		 maestro.setOnClickListener(this);
		 abuelo.setOnClickListener(this);
		 abuela.setOnClickListener(this);
		 amiga.setOnClickListener(this);
		 amigo.setOnClickListener(this);
		 hermana.setOnClickListener(this);
		 hermano.setOnClickListener(this);

	}

	public void abrirPuedo() {

		message = getString(R.string.puedo_);
		Toast.makeText(PersonasActivity.this, message, Toast.LENGTH_SHORT)
				.show();

		if (getIdioma.equals("es")) {

			MediaPlayer.create(this, R.raw.puedo).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.cani).start();

		}

	}

	public void abrirUsar() {

		message = getString(R.string.usar);
		Toast.makeText(PersonasActivity.this, message, Toast.LENGTH_SHORT)
				.show();
		if (getIdioma.equals("es")) {

			MediaPlayer.create(this, R.raw.usar).start();

		} else if (getIdioma.equals("en")) {

			MediaPlayer.create(this, R.raw.wear).start();

		}

		Intent intent = new Intent(PersonasActivity.this, RopaActivity.class);
		startActivity(intent);

	}

	public void abrirComer() {

		message = getString(R.string.comer);
		Toast.makeText(PersonasActivity.this, message, Toast.LENGTH_SHORT)
				.show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.comer).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.eat).start();

		}

		Intent intent = new Intent(PersonasActivity.this, ComidaActivity.class);
		startActivity(intent);
		overridePendingTransition(android.R.anim.slide_in_left,
				android.R.anim.slide_out_right);

	}

	public void abrirJugar() {

		message = getString(R.string.jugar);
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.jugar).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.play).start();

		}

		Intent intent = new Intent(PersonasActivity.this, Juegos.class);
		startActivity(intent);

	}

	public void abrirActividad() {
		message = getString(R.string.actividad);
		Toast.makeText(PersonasActivity.this, message, Toast.LENGTH_SHORT)
				.show();

		Intent intent = new Intent(PersonasActivity.this, VerbosActivity.class);
		startActivity(intent);

	}

	public void papaPres() {

		message = getString(R.string.papa);
		Toast.makeText(PersonasActivity.this, message, Toast.LENGTH_SHORT)
				.show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.papa).start();
		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.father).start();
			;

		}

	}

	public void mamaPres() {

		message = getString(R.string.mama);
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.mama).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.mother).start();

		}

	}

	public void maestroPres() {

		message = getString(R.string.maestro);

		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.maestro).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.teacher).start();

		}

	}

	public void maestraPres() {

		message = getString(R.string.maestra);

		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
		if (getIdioma.equals("es")) {

			MediaPlayer.create(this, R.raw.maestra).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.mistress).start();

		}

	}

	public void abueloPres() {

		message = getString(R.string.abuelo);
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.abuelo).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.grandfather).start();

		}

	}

	public void abuelaPres() {

		message = getString(R.string.abuela);
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.abuela).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.grandmother).start();

		}

	}

	public void amigoPres() {

		message = getString(R.string.amigo);
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.amigo).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.boyfriend).start();

		}

	}

	public void amigaPres() {

		message = getString(R.string.amiga);
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.amiga).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.girlfriend).start();

		}

	}

	public void hermana() {

		message = getString(R.string.hermana);
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.hermana).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.sister).start();

		}

	}

	public void hermano() {

		message = getString(R.string.hermano);
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.hermano).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.brother).start();

		}

	}

	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.puedo:
			abrirPuedo();

			break;
		case R.id.usar:
			abrirUsar();

			break;
		case R.id.comer:
			abrirComer();

			break;
		case R.id.jugar:
			abrirJugar();

			break;
		case R.id.actividad:
			abrirActividad();

			break;
		case R.id.mama:
			mamaPres();
			break;
		case R.id.abuela:
			abuelaPres();
			break;
		case R.id.amiga:
			amigaPres();
			break;

		case R.id.hermana:
			hermana();
			break;
		case R.id.maestra:
			maestraPres();
			break;
		case R.id.papa:
			papaPres();
			break;
		case R.id.abuelo:
			abueloPres();
			break;
		case R.id.amigo:
			amigoPres();
			break;
		case R.id.hermano:
			hermano();
			break;
		case R.id.maestro:
			maestroPres();
			break;

		}

	}

	public void onBackPressed() {
		super.onBackPressed();
		overridePendingTransition(android.R.anim.fade_in,
				android.R.anim.fade_out);
	}

}
