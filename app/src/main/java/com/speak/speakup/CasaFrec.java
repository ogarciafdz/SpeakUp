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

public class CasaFrec extends Activity implements OnClickListener {

	private ImageButton puerta;
	private ImageButton salir;
	private ImageButton bano;
	private ImageButton sentar;
	private ImageButton cocina;
	private ImageButton comer;
	private ImageButton cubierto;
	private ImageButton beber;
	private ImageButton silla;
	private ImageButton casa;
	private ImageButton telefono;
	private ImageButton dormir;
	private ImageButton sillon;
	private ImageButton computadora;
	private ImageButton tv;
	private ImageButton cama;
	private ImageButton medicina;
	MainActivity per = new MainActivity();
	String getIdioma = per.idioma;
	String message;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_casa_frec);

		puerta = (ImageButton) findViewById(R.id.CFimageButton1);
		salir = (ImageButton) findViewById(R.id.CFimageButton2);
		bano = (ImageButton) findViewById(R.id.CFimageButton3);
		sentar = (ImageButton) findViewById(R.id.CFimageButton4);
		cocina = (ImageButton) findViewById(R.id.CFimageButton5);
		comer = (ImageButton) findViewById(R.id.CFimageButton6);
		cubierto = (ImageButton) findViewById(R.id.CFimageButton7);
		beber = (ImageButton) findViewById(R.id.CFimageButton8);
		silla = (ImageButton) findViewById(R.id.CFimageButton9);
		casa = (ImageButton) findViewById(R.id.CFimageButton10);
		telefono = (ImageButton) findViewById(R.id.CFimageButton11);
		dormir = (ImageButton) findViewById(R.id.CFimageButton12);
		sillon = (ImageButton) findViewById(R.id.CFimageButton13);
		computadora = (ImageButton) findViewById(R.id.CFimageButton14);
		tv = (ImageButton) findViewById(R.id.CFimageButton15);
		cama = (ImageButton) findViewById(R.id.CFimageButton16);
		medicina = (ImageButton) findViewById(R.id.CFimageButton17);

		puerta.setOnClickListener(this);
		salir.setOnClickListener(this);
		bano.setOnClickListener(this);
		sentar.setOnClickListener(this);
		cocina.setOnClickListener(this);
		comer.setOnClickListener(this);
		cubierto.setOnClickListener(this);
		beber.setOnClickListener(this);
		silla.setOnClickListener(this);
		casa.setOnClickListener(this);
		telefono.setOnClickListener(this);
		dormir.setOnClickListener(this);
		sillon.setOnClickListener(this);
		computadora.setOnClickListener(this);
		tv.setOnClickListener(this);
		cama.setOnClickListener(this);
		medicina.setOnClickListener(this);

	}

	public void puerta() {

		message = getString(R.string.abrepuerta);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.abrirpuerta).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.opendoor).start();

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

	public void cocina() {
		message = getString(R.string.ircocina);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.cocina).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.kichen).start();

		}
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

	public void cubierto() {
		message = getString(R.string.cubiertos);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.cubiertos).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.cutlery).start();

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

		Intent intent = new Intent(CasaFrec.this, ComidaActivity.class);
		startActivity(intent);

	}

	public void silla() {
		message = getString(R.string.usarsilla);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.silla).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.chair).start();

		}
	}

	public void casa() {
		message = getString(R.string.ircasa);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.casa).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.house).start();

		}
	}

	public void telefono() {
		message = getString(R.string.telefono);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.telefono).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.telephone).start();

		}

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

	public void sillon() {
		message = getString(R.string.sillon);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.sillon).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.couch).start();

		}

	}

	public void compu() {
		message = getString(R.string.compu);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.computadora).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.computer).start();

		}

	}

	public void tv() {
		message = getString(R.string.tv);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.tele).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.tv).start();

		}
	}

	public void cama() {
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.cama).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.acostarse1).start();

		}

	}

	public void medicina() {
		message = getString(R.string.medicina);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.medicina).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.medicine).start();

		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.casa_frec, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.CFimageButton1:
			puerta();
			break;
		case R.id.CFimageButton2:
			salir();
			break;
		case R.id.CFimageButton3:
			bano();
			break;
		case R.id.CFimageButton4:
			sentar();
			break;
		case R.id.CFimageButton5:
			cocina();
			break;
		case R.id.CFimageButton6:
			comer();
			break;
		case R.id.CFimageButton7:
			cubierto();
			break;
		case R.id.CFimageButton8:
			beber();
			break;
		case R.id.CFimageButton9:
			silla();
			break;
		case R.id.CFimageButton10:
			casa();
			break;
		case R.id.CFimageButton11:
			telefono();
			break;
		case R.id.CFimageButton12:
			dormir();
			break;
		case R.id.CFimageButton13:
			sillon();
			break;
		case R.id.CFimageButton14:
			compu();
			break;
		case R.id.CFimageButton15:
			tv();
			break;
		case R.id.CFimageButton16:
			cama();
			break;
		case R.id.CFimageButton17:
			medicina();
			break;

		}

	}

}
