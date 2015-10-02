package com.speak.speakup;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class EscuelaFrec extends Activity implements OnClickListener {

	private ImageButton lapiz;
	private ImageButton tijera;
	private ImageButton sacap;
	private ImageButton prit;
	private ImageButton color;
	private ImageButton libreta;
	private ImageButton borrador;
	private ImageButton lonche;
	private ImageButton salir;
	private ImageButton abrirp;
	private ImageButton bano;
	private ImageButton sentar;
	private ImageButton papeleria;


	MainActivity per = new MainActivity();
	String getIdioma = per.idioma;
	String message;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_escuela_frec);

		lapiz = (ImageButton) findViewById(R.id.EFimageButton1);
		tijera = (ImageButton) findViewById(R.id.EFimageButton2);
		sacap = (ImageButton) findViewById(R.id.EFimageButton3);
		prit = (ImageButton) findViewById(R.id.EFimageButton4);
		salir = (ImageButton) findViewById(R.id.EFimageButton5);
		abrirp = (ImageButton) findViewById(R.id.EFimageButton6);
		bano = (ImageButton) findViewById(R.id.EFimageButton7);
		sentar = (ImageButton) findViewById(R.id.EFimageButton8);
		color = (ImageButton) findViewById(R.id.EFimageButton9);
		libreta = (ImageButton) findViewById(R.id.EFimageButton10);
		borrador = (ImageButton) findViewById(R.id.EFimageButton11);
		lonche = (ImageButton) findViewById(R.id.EFimageButton12);
		papeleria = (ImageButton) findViewById(R.id.EFimagePape);



		lapiz.setOnClickListener(this);
		tijera.setOnClickListener(this);
		sacap.setOnClickListener(this);
		prit.setOnClickListener(this);
		color.setOnClickListener(this);
		libreta.setOnClickListener(this);
		borrador.setOnClickListener(this);
		lonche.setOnClickListener(this);
		salir.setOnClickListener(this);
		abrirp.setOnClickListener(this);
		bano.setOnClickListener(this);
		sentar.setOnClickListener(this);
		papeleria.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.escuela_frec, menu);
		return true;
	}

	public void lapiz() {

		message = getString(R.string.escribir);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.escribir).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.write).start();

		}

	}

	public void tijera() {
		message = getString(R.string.rectoar);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.recortar).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.trim).start();

		}

	}

	public void sacap() {
		message = getString(R.string.saca);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.punta).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.sharpener).start();

		}

	}

	public void prit() {
		message = getString(R.string.pegamento);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.pegamento).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.glue).start();

		}

	}

	public void color() {
		message = getString(R.string.coloreal);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.colorear).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.coloring).start();

		}

	}

	public void libreta() {
		message = getString(R.string.libreta);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.libreta).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.book).start();

		}

	}

	public void borrador() {
		message = getString(R.string.borrar);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.borrar).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.earse).start();

		}

	}

	public void lonche() {

		message = getString(R.string.lonche);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.lonche).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.lunch).start();

		}

	}

	public void salir() {
		message = getString(R.string.salir);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.salir).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.exit).start();

		}

	}

	public void abrirp() {
		message = getString(R.string.abrepuerta);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.abrirpuerta).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.opendoor).start();

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

	public void sentar() {
		message = getString(R.string.sentarse);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.sentarme).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.sit).start();

		}

	}


	private void papeleria() {
		message = getString(R.string.papeleria);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.papeleria).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.papeleria).start();

		}

		Intent intent = new Intent(EscuelaFrec.this, Papeleria.class);
		startActivity(intent);
		overridePendingTransition(android.R.anim.slide_in_left,
				android.R.anim.slide_out_right);


	}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.EFimageButton1:
			lapiz();
			break;
		case R.id.EFimageButton2:
			tijera();
			break;
		case R.id.EFimageButton3:
			sacap();
			break;
		case R.id.EFimageButton4:
			prit();
			break;
		case R.id.EFimageButton5:
			salir();
			break;
		case R.id.EFimageButton6:
			libreta();
			break;
		case R.id.EFimageButton7:
			bano();
			break;
		case R.id.EFimageButton8:
			sentar();
			break;
		case R.id.EFimageButton9:
			color();
			break;
		case R.id.EFimageButton10:
			abrirp();
			break;
		case R.id.EFimageButton11:

			borrador();
			break;
		case R.id.EFimageButton12:
			lonche();
			break;
			case R.id.EFimagePape:
				papeleria();
				break;

		}

	}

}
