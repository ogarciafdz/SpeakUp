package com.speak.speakup;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.Toast;

public class ComidaActivity extends Activity implements OnClickListener {

	private ImageButton Arroz;
	private ImageButton Carne;
	private ImageButton Frijoles;
	private ImageButton Fruta;
	private ImageButton Huevo;
	private ImageButton Verdura;
	private ImageButton Pescado;
	private ImageButton lechuga;
	private ImageButton tomate;
	private ImageButton pepino;
	private ImageButton brocoli;
	private ImageButton pollo;
	private ImageButton queso;
	private ImageButton chocomilk;
	private ImageButton leche;
	private ImageButton soda;
	private ImageButton cafe;
	private ImageButton agua;
	private ImageButton pasta;
	private ImageButton pan;
	private ImageButton galleta;
	private ImageButton tortilla;
	private ImageButton manzana;
	private ImageButton platano;
	private ImageButton melon;
	private ImageButton sandia;
	private ImageButton pera;
	private ImageButton uvas;
	private ImageButton zanahoria;
	MainActivity per = new MainActivity();
	String getIdioma = per.idioma;
	String message;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_comida);

		Arroz = (ImageButton) findViewById(R.id.imageButtonarroz);
		Carne = (ImageButton) findViewById(R.id.imageButtoncarne);
		Frijoles = (ImageButton) findViewById(R.id.imageButtonfrijol);
		Fruta = (ImageButton) findViewById(R.id.imageButtonfrutas);
		Huevo = (ImageButton) findViewById(R.id.imageButtonhuevo);
		Verdura = (ImageButton) findViewById(R.id.imageButtonverduras);
		Pescado = (ImageButton) findViewById(R.id.imageButtonpescado);
		lechuga = (ImageButton) findViewById(R.id.imageButtonlechuga);
		tomate = (ImageButton) findViewById(R.id.imageButtontomate);
		zanahoria = (ImageButton) findViewById(R.id.imageButtonzanahoria);
		pepino = (ImageButton) findViewById(R.id.imageButtonpepino);
		brocoli = (ImageButton) findViewById(R.id.imageButtonbrocoli);
		pollo = (ImageButton) findViewById(R.id.imageButtonpollo);
		queso = (ImageButton) findViewById(R.id.imageButtonqueso);
		chocomilk = (ImageButton) findViewById(R.id.imageButtonchoco);
		leche = (ImageButton) findViewById(R.id.imageButtonleche);
		soda = (ImageButton) findViewById(R.id.imageButtonsoda);
		cafe = (ImageButton) findViewById(R.id.imageButtoncafe);
		agua = (ImageButton) findViewById(R.id.imageButtonagua);
		pasta = (ImageButton) findViewById(R.id.imageButtonpasta);
		pan = (ImageButton) findViewById(R.id.imageButtonpan);
		galleta = (ImageButton) findViewById(R.id.imageButtongalleta);
		tortilla = (ImageButton) findViewById(R.id.imageButtontortilla);
		manzana = (ImageButton) findViewById(R.id.imageButtonmanzana);
		platano = (ImageButton) findViewById(R.id.imageButtonplatano);
		melon = (ImageButton) findViewById(R.id.imageButtonmelon);
		sandia = (ImageButton) findViewById(R.id.imageButtonsandia);
		pera = (ImageButton) findViewById(R.id.imageButtonpera);
		uvas = (ImageButton) findViewById(R.id.imageButtonuvas);

		Arroz.setOnClickListener(this);
		Carne.setOnClickListener(this);
		Frijoles.setOnClickListener(this);
		Fruta.setOnClickListener(this);
		Huevo.setOnClickListener(this);
		Verdura.setOnClickListener(this);
		Pescado.setOnClickListener(this);
		lechuga.setOnClickListener(this);
		tomate.setOnClickListener(this);
		zanahoria.setOnClickListener(this);
		pepino.setOnClickListener(this);
		brocoli.setOnClickListener(this);
		pollo.setOnClickListener(this);
		queso.setOnClickListener(this);
		chocomilk.setOnClickListener(this);
		leche.setOnClickListener(this);
		soda.setOnClickListener(this);
		cafe.setOnClickListener(this);
		agua.setOnClickListener(this);
		pasta.setOnClickListener(this);
		pan.setOnClickListener(this);
		galleta.setOnClickListener(this);
		tortilla.setOnClickListener(this);
		manzana.setOnClickListener(this);
		platano.setOnClickListener(this);
		melon.setOnClickListener(this);
		sandia.setOnClickListener(this);
		pera.setOnClickListener(this);
		uvas.setOnClickListener(this);

		// Animacion del boton en circulo
		final RotateAnimation rotateAnimation = new RotateAnimation(0, 360,
				Animation.RELATIVE_TO_SELF, .5f, Animation.RELATIVE_TO_SELF,
				.5f);
		rotateAnimation.setDuration(1000);

		// Animaciones
		final AnimationSet setAnimation = new AnimationSet(true);
		setAnimation.addAnimation(rotateAnimation);

		setupAnimation(Arroz, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(Carne, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(Frijoles, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(Fruta, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(Huevo, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(Verdura, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(Pescado, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(lechuga, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(tomate, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(pepino, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(brocoli, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(pollo, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(queso, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(chocomilk, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(leche, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(soda, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(cafe, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(agua, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(pasta, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(pan, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(galleta, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(tortilla, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(manzana, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(platano, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(melon, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(sandia, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(pera, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(uvas, rotateAnimation, R.anim.rotate_anim);
		setupAnimation(zanahoria, rotateAnimation, R.anim.rotate_anim);

	}

	public void Arroz() {

		message = getString(R.string.arroz);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.arroz).start();

		} else if (getIdioma.equals("en")) {

			MediaPlayer.create(this, R.raw.rice).start();

		}
	}

	public void Carne() {

		message = getString(R.string.carne);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.carne).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.meat).start();

		}
	}

	public void Frijol() {

		message = getString(R.string.frijol);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {

			MediaPlayer.create(this, R.raw.frijol).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.beans).start();

		}

	}

	public void Fruta() {

		message = getString(R.string.fruta);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.fruta).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.fruits).start();

		}

	}

	public void Huevo() {

		message = getString(R.string.huevo);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.huevo).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.egg).start();

		}

	}

	public void Verduras() {

		message = getString(R.string.verduras);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.verduras).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.vegetables).start();

		}

	}

	public void Pescado() {

		message = getString(R.string.pescado);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.pescado).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.fish).start();

		}

	}

	public void lechuga() {
		message = getString(R.string.lechuga);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.lechuga).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.lettuce).start();

		}

	}

	public void tomate() {

		message = getString(R.string.tomate);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.tomate).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.tomato).start();

		}

	}

	public void zanahoria() {
		message = getString(R.string.zanahoria);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.zanahoria).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.carrot).start();

		}

	}

	public void pepino() {
		message = getString(R.string.pepino);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.pepino).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.cucumber).start();

		}

	}

	public void brocoli() {
		message = getString(R.string.brocoli);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.brocoli).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.broccoli).start();

		}

	}

	public void pollo() {

		message = getString(R.string.pollo);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.pollo).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.chicken).start();

		}

	}

	public void queso() {
		message = getString(R.string.queso);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.queso).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.cheese).start();

		}

	}

	public void choco() {
		message = getString(R.string.chocolatosa);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.cholate).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.chocolate).start();

		}

	}

	public void leche() {
		message = getString(R.string.leche);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.leche).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.milk).start();

		}

	}

	public void soda() {

		message = getString(R.string.soda);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.soda).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.sodaingles).start();

		}

	}

	public void cafe() {
		message = getString(R.string.cafe);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.cafe).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.coffee).start();

		}

	}

	public void agua() {
		message = getString(R.string.agua);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.agua).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.water).start();

		}

	}

	public void pasta() {
		message = getString(R.string.pasta);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.pasta).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.pastaingles).start();

		}

	}

	public void pan() {
		message = getString(R.string.pan);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.pan).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.bread).start();

		}

	}

	public void galleta() {
		message = getString(R.string.galleta);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.galleta).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.cookie).start();

		}

	}

	public void tortilla() {
		message = getString(R.string.tortilla);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.tortilla).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.tortillaingles).start();

		}

	}

	public void manzana() {
		message = getString(R.string.manzana);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.manzana).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.applex).start();

		}

	}

	public void platano() {
		message = getString(R.string.platano);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.platano).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.bannana).start();

		}
	}

	public void melon() {
		message = getString(R.string.melon);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.melon).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.meloningles).start();

		}
	}

	public void sandia() {

		message = getString(R.string.sandia);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.sandia).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.wathermelon).start();

		}

	}

	public void pera() {
		message = getString(R.string.pera);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.pera).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.pear).start();

		}

	}

	public void uvas() {
		message = getString(R.string.uvas);
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

		if (getIdioma.equals("es")) {
			MediaPlayer.create(this, R.raw.uvas).start();

		} else if (getIdioma.equals("en")) {
			MediaPlayer.create(this, R.raw.grapes).start();

		}

	}

	private void setupAnimation(View view, final Animation animation,
			final int animationID) {
		view.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				switch (v.getId()) {
				case R.id.imageButtonarroz:
					Arroz();
					break;
				case R.id.imageButtoncarne:
					Carne();
					break;
				case R.id.imageButtonfrijol:
					Frijol();
					break;
				case R.id.imageButtonfrutas:
					Fruta();
					break;
				case R.id.imageButtonhuevo:
					Huevo();
					break;
				case R.id.imageButtonverduras:
					Verduras();
					break;
				case R.id.imageButtonpescado:
					Pescado();
					break;
				case R.id.imageButtonlechuga:
					lechuga();
					break;
				case R.id.imageButtontomate:
					tomate();
					break;
				case R.id.imageButtonzanahoria:
					zanahoria();
					break;
				case R.id.imageButtonpepino:
					pepino();
					break;
				case R.id.imageButtonbrocoli:
					brocoli();
					break;
				case R.id.imageButtonpollo:
					pollo();
					break;
				case R.id.imageButtonqueso:
					queso();
					break;
				case R.id.imageButtonchoco:
					choco();
					break;
				case R.id.imageButtonleche:
					leche();
					break;
				case R.id.imageButtonsoda:
					soda();
					break;
				case R.id.imageButtoncafe:
					cafe();
					break;
				case R.id.imageButtonagua:
					agua();
					break;
				case R.id.imageButtonpasta:
					pasta();
					break;
				case R.id.imageButtonpan:
					pan();
					break;
				case R.id.imageButtongalleta:
					galleta();
					break;
				case R.id.imageButtontortilla:
					tortilla();
					break;
				case R.id.imageButtonmanzana:
					manzana();
					break;
				case R.id.imageButtonplatano:
					platano();
					break;
				case R.id.imageButtonmelon:
					melon();
					break;
				case R.id.imageButtonsandia:
					sandia();
					break;
				case R.id.imageButtonpera:
					pera();
					break;
				case R.id.imageButtonuvas:
					uvas();
					break;
				}

				v.startAnimation(AnimationUtils.loadAnimation(
						ComidaActivity.this, animationID));
			}
		});
	}

	public void onBackPressed() {
		super.onBackPressed();
		overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

}
