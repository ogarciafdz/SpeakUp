package com.speak.speakup;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

import com.speak.speakup.util.CineActivity;

public class VerbosActivity extends Activity implements OnClickListener {

	private ImageButton Acostar;
	private ImageButton Bano;
	private ImageButton Cama;
	private ImageButton Casa;
	private ImageButton Cell;
	private ImageButton Cocina;
	private ImageButton Colorear;
	private ImageButton Comer;
	private ImageButton Libreta;
	private ImageButton Dormir;
	private ImageButton Futbol;
	private ImageButton Comunicar;
	private ImageButton Lapiz;
	private ImageButton Leer;
	private ImageButton Libro;
	private ImageButton Telefono;
	private ImageButton Salir;
	private ImageButton Sentarse;
	private ImageButton Silla;
	private ImageButton parque;
	private ImageButton cine;


	MainActivity per = new MainActivity();
	String getIdioma = per.idioma;
	String message;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_verbos);

		Acostar = (ImageButton) findViewById(R.id.VimageButton1);
		Bano = (ImageButton) findViewById(R.id.VimageButton2);
		Cama = (ImageButton) findViewById(R.id.VimageButton3);
		Casa = (ImageButton) findViewById(R.id.VimageButton4);
		Cell = (ImageButton) findViewById(R.id.VimageButton5);
		Cocina = (ImageButton) findViewById(R.id.VimageButton6);
		Colorear = (ImageButton) findViewById(R.id.VimageButton7);
		Comer = (ImageButton) findViewById(R.id.VimageButton8);
		Libreta = (ImageButton) findViewById(R.id.VimageButton9);
		Dormir = (ImageButton) findViewById(R.id.VimageButton10);
		Futbol = (ImageButton) findViewById(R.id.VimageButton11);
		Comunicar = (ImageButton) findViewById(R.id.VimageButton12);
		Lapiz = (ImageButton) findViewById(R.id.VimageButton13);
		Leer = (ImageButton) findViewById(R.id.VimageButton14);
		Libro = (ImageButton) findViewById(R.id.VimageButton15);
		Telefono = (ImageButton) findViewById(R.id.VimageButton16);
		Salir = (ImageButton) findViewById(R.id.VimageButton17);
		Sentarse = (ImageButton) findViewById(R.id.VimageButton18);
		Silla = (ImageButton) findViewById(R.id.VimageButton19);
		parque = (ImageButton) findViewById(R.id.VimageButton20);
		cine = (ImageButton) findViewById(R.id.cine);

		Acostar.setOnClickListener(this);
		Bano.setOnClickListener(this);
		Cama.setOnClickListener(this);
		Casa.setOnClickListener(this);
		Cell.setOnClickListener(this);
		Cocina.setOnClickListener(this);
		Colorear.setOnClickListener(this);
		Comer.setOnClickListener(this);
		Libreta.setOnClickListener(this);
		Dormir.setOnClickListener(this);
		Futbol.setOnClickListener(this);
		Comunicar.setOnClickListener(this);
		Lapiz.setOnClickListener(this);
		Leer.setOnClickListener(this);
		Libro.setOnClickListener(this);
		Telefono.setOnClickListener(this);
		Salir.setOnClickListener(this);
		Sentarse.setOnClickListener(this);
		Silla.setOnClickListener(this);
		parque.setOnClickListener(this);
		cine.setOnClickListener(this);

	}

	public void pressAcostar() {

		message = getString(R.string.acostarse);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.acostame).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.bed).start();

		}

	}

	public void pressBano() {
		message = getString(R.string.usarelbano);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.iralbanio).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.toilet).start();

		}

	}

	public void pressCama() {
		message = getString(R.string.ircama);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.cama).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.acostarse1).start();

		}

	}

	public void pressCasa() {
		message = getString(R.string.ircasa);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.casa).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.house).start();

		}

	}

	public void pressCell() {
		message = getString(R.string.celular);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.celular).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.movile).start();

		}

	}

	public void pressCocina() {
		message = getString(R.string.ircocina);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.cocina).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.kichen).start();

		}

	}

	public void pressColorear() {
		message = getString(R.string.coloreal);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.colorear).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.coloring).start();

		}

	}

	public void pressComer() {
		message = getString(R.string.comer);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.comer).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.eat).start();

		}

	}

	public void pressLibreta() {
		message = getString(R.string.libreta);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.libreta).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.notpad).start();

		}

	}

	public void pressDormir() {
		message = getString(R.string.dormir);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.dormir).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.sleep).start();

		}

	}

	public void pressFutbol() {
		message = getString(R.string.futbol);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.futbol).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.football).start();

		}

	}

	public void pressComnunicar() {
		message = getString(R.string.platicar);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.platicar).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.chat).start();

		}

	}

	public void pressLapiz() {
		message = getString(R.string.escribir);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.escribir).start();

		} else if (getIdioma.equals("en")) {

			MediaPlayer.create(this, R.raw.write).start();

		}

	}

	public void pressLeer() {
		message = getString(R.string.leer);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.libro).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.read).start();

		}

	}

	// Modificar

	public void pressLibro() {
		message = getString(R.string.leer);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.libro).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.read).start();

		}
	}

	public void pressTele() {
		message = getString(R.string.tv);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.tele).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.tv).start();

		}

	}

	public void pressSalir() {
		message = getString(R.string.salir);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.salir).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.exit).start();

		}

	}

	public void pressSentarse() {
		message = getString(R.string.sentarse);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.sentarme).start();
		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.sit).start();

		}

	}

	public void pressSilla() {
		message = getString(R.string.usarsilla);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.silla).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.chair).start();

		}

	}

	public void pressTelefono() {
		message = getString(R.string.telefono);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.telefono).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.telephone).start();

		}

	}

	public void pressPark() {
		message = getString(R.string.irparque);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.parque).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.park).start();

		}

	}

	private void cine() {
		message = getString(R.string.ircine);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		MediaPlayer mp = new MediaPlayer();
		if (getIdioma.equals("es")) {
			mp = MediaPlayer.create(this, R.raw.cine);

		} else if (getIdioma.equals("en")) {
			mp =	MediaPlayer.create(this, R.raw.cinema);

		}
		mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer mp) {
				Intent intent = new Intent(VerbosActivity.this, CineActivity.class);
				startActivity(intent);

			}

		});

		mp.start();


	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
			case R.id.VimageButton1:
				pressAcostar();
				break;
			case R.id.VimageButton2:
				pressBano();
				break;
			case R.id.VimageButton3:
				pressCama();
				break;
			case R.id.VimageButton4:
				pressCocina();
				break;
			case R.id.VimageButton5:
				pressColorear();
				break;
			case R.id.VimageButton6:
				pressComer();
				break;
			case R.id.VimageButton7:
				pressCasa();
				break;
			case R.id.VimageButton8:
				pressCell();
				break;
			case R.id.VimageButton9:
				pressLibreta();
				break;
			case R.id.VimageButton10:
				pressDormir();
				break;
			case R.id.VimageButton11:
				pressFutbol();
				break;
			case R.id.VimageButton12:
				pressComnunicar();
				break;
			case R.id.VimageButton13:
				pressLapiz();
				break;
			case R.id.VimageButton14:
				pressLeer();
				break;
			case R.id.VimageButton15:
				pressLibro();
				break;
			case R.id.VimageButton16:
				pressTelefono();
				break;
			case R.id.VimageButton17:
				pressSalir();
				break;
			case R.id.VimageButton18:
				pressSentarse();
				break;
			case R.id.VimageButton19:
				pressSilla();
				break;
			case R.id.VimageButton20:
				pressPark();
				break;
			case R.id.cine:
				cine();
				break;
		}
	}


}
