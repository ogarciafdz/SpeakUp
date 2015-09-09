package com.speak.speakup;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class RopaActivity extends Activity implements OnClickListener {

	private ImageButton camisa;
	private ImageButton falda;
	private ImageButton gorra;
	private ImageButton sueter;
	private ImageButton pantalon;
	private ImageButton camiseta;
	private ImageButton tenis;
	private ImageButton zapato;
	private ImageButton blusa;
	private ImageButton vestido;
	private ImageButton tacones;
	MainActivity per = new MainActivity();
	String getIdioma = per.idioma;
	String message;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ropa);

		camisa = (ImageButton) findViewById(R.id.RimageButton1);
		pantalon = (ImageButton) findViewById(R.id.RimageButton2);
		tenis = (ImageButton) findViewById(R.id.RimageButton3);
		camiseta = (ImageButton) findViewById(R.id.RimageButton4);
		gorra = (ImageButton) findViewById(R.id.RimageButton5);
		sueter = (ImageButton) findViewById(R.id.RimageButton6);
		zapato = (ImageButton) findViewById(R.id.RimageButton7);
		falda = (ImageButton) findViewById(R.id.RimageButton8);
		blusa = (ImageButton) findViewById(R.id.RimageButton9);
		tacones = (ImageButton) findViewById(R.id.RimageButton10);
		vestido = (ImageButton) findViewById(R.id.RimageButton11);

		camisa.setOnClickListener(this);
		falda.setOnClickListener(this);
		gorra.setOnClickListener(this);
		sueter.setOnClickListener(this);
		pantalon.setOnClickListener(this);
		camiseta.setOnClickListener(this);
		tenis.setOnClickListener(this);
		zapato.setOnClickListener(this);
		blusa.setOnClickListener(this);
		vestido.setOnClickListener(this);
		tacones.setOnClickListener(this);
	}

	public void tenis() {
		message = getString(R.string.tenis);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.tenis).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.sneakers).start();

		}

	}

	public void zapato() {
		message = getString(R.string.zapatos);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.zapatos).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.shoes).start();

		}
	}

	public void blusa() {
		message = getString(R.string.blusa);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.blusa).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.blouse).start();

		}

	}

	public void vestido() {
		message = getString(R.string.vestido);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.vestido).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.dress).start();

		}

	}

	public void tacones() {
		message = getString(R.string.tacones);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.tacones).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.highheels).start();

		}

	}

	public void camisa() {
		message = getString(R.string.camisa);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.camisa).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.shirt).start();

		}

	}

	public void falda() {
		message = getString(R.string.falda);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.falda).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.skirt).start();

		}

	}

	public void gorra() {
		message = getString(R.string.gorra);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.gorra).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.cap).start();

		}

	}

	public void sueter() {
		message = getString(R.string.sueter);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.sueter).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.sweater).start();

		}

	}

	public void pantalon() {
		message = getString(R.string.pantalon);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.pantalon).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.trousers).start();

		}

	}

	public void camiseta() {
		message = getString(R.string.camiseta);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.camiseta).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.tshirt).start();

		}

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.RimageButton1:
			camisa();
			break;
		case R.id.RimageButton2:
			pantalon();
			break;
		case R.id.RimageButton3:
			tenis();
			break;
		case R.id.RimageButton4:
			camiseta();
			break;
		case R.id.RimageButton5:
			gorra();
			break;
		case R.id.RimageButton6:
			sueter();
			break;
		case R.id.RimageButton7:
			zapato();
			break;
		case R.id.RimageButton8:
			falda();
			break;
		case R.id.RimageButton9:
			blusa();
			break;
		case R.id.RimageButton10:
			tacones();
			break;
		case R.id.RimageButton11:
			vestido();
			break;
		}
	}

}
