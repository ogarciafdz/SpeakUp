package com.speak.speakup;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Papeleria extends Activity implements View.OnClickListener {

    private ImageButton lapiz;
    private ImageButton tijera;
    private ImageButton sacap;
    private ImageButton prit;
    private ImageButton color;
    private ImageButton libreta;
    private ImageButton borrador;
    private ImageButton mapa;
    private ImageButton cartulina;

    MainActivity per = new MainActivity();
    String getIdioma = per.idioma;
    String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papeleria);

        lapiz = (ImageButton) findViewById(R.id.EFimageButton1);
        tijera = (ImageButton) findViewById(R.id.EFimageButton2);
        sacap = (ImageButton) findViewById(R.id.EFimageButton3);
        prit = (ImageButton) findViewById(R.id.EFimageButton4);
        borrador = (ImageButton) findViewById(R.id.EFimageButton11);
        mapa = (ImageButton) findViewById(R.id.mapa);
        cartulina = (ImageButton) findViewById(R.id.cartulina);

        lapiz.setOnClickListener(this);
        tijera.setOnClickListener(this);
        sacap.setOnClickListener(this);
        prit.setOnClickListener(this);
        borrador.setOnClickListener(this);
        mapa.setOnClickListener(this);
        cartulina.setOnClickListener(this);

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

    public void borrador() {
        message = getString(R.string.borrar);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        if (getIdioma.equals("es")) {
            MediaPlayer.create(this, R.raw.borrar).start();

        } else if (getIdioma.equals("en")) {
            MediaPlayer.create(this, R.raw.earse).start();

        }

    }

    public void mapa() {
        message = getString(R.string.mapa);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        if (getIdioma.equals("es")) {
            MediaPlayer.create(this, R.raw.mapa).start();

        } else if (getIdioma.equals("en")) {
            MediaPlayer.create(this, R.raw.mapa).start();

        }

    }

    public void cartulina() {
        message = getString(R.string.cartulina);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        if (getIdioma.equals("es")) {
            MediaPlayer.create(this, R.raw.cartulina).start();

        } else if (getIdioma.equals("en")) {
            MediaPlayer.create(this, R.raw.cartulina).start();

        }

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
            case R.id.EFimageButton11:
                borrador();
                break;
            case R.id.mapa:
                mapa();
                break;
            case R.id.cartulina:
                cartulina();
                break;
        }
    }
}
