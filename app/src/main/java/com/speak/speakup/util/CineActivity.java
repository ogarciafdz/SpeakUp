package com.speak.speakup.util;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.speak.speakup.MainActivity;
import com.speak.speakup.R;

public class CineActivity extends Activity implements View.OnClickListener {

    private ImageButton palomitas;
    private ImageButton hotdog;
    private ImageButton nachos;
    private ImageButton dulces;
    private ImageButton nieve;
    private ImageButton chocolate;

    MainActivity per = new MainActivity();
    String getIdioma = per.idioma;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cine);

        palomitas = (ImageButton) findViewById(R.id.palomas);
        hotdog = (ImageButton) findViewById(R.id.hotdog);
        nachos = (ImageButton) findViewById(R.id.nachos);
        dulces = (ImageButton) findViewById(R.id.dulces);
        nieve = (ImageButton) findViewById(R.id.nieve);
        chocolate = (ImageButton) findViewById(R.id.chocolate);

        palomitas.setOnClickListener(this);
        hotdog.setOnClickListener(this);
        nachos.setOnClickListener(this);
        dulces.setOnClickListener(this);
        nieve.setOnClickListener(this);
        chocolate.setOnClickListener(this);

    }

    private void nachos() {

        message = getString(R.string.nachos);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        if (getIdioma.equals("es")) {
            MediaPlayer.create(this, R.raw.nachos).start();

        } else if (getIdioma.equals("en")) {
            MediaPlayer.create(this, R.raw.nachos).start();

        }


    }

    private void hotdog() {

        message = getString(R.string.hotdogs);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        if (getIdioma.equals("es")) {
            MediaPlayer.create(this, R.raw.hotdog).start();

        } else if (getIdioma.equals("en")) {
            MediaPlayer.create(this, R.raw.hotdog).start();

        }

    }

    private void palomitas() {

        message = getString(R.string.palomitas);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        if (getIdioma.equals("es")) {
            MediaPlayer.create(this, R.raw.palomitas).start();

        } else if (getIdioma.equals("en")) {
            MediaPlayer.create(this, R.raw.palomitas).start();

        }

    }
    private void dulces() {

        message = getString(R.string.dulces);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        if (getIdioma.equals("es")) {
            MediaPlayer.create(this, R.raw.dulces).start();

        } else if (getIdioma.equals("en")) {
            MediaPlayer.create(this, R.raw.dulces).start();

        }

    }
    private void nieve() {

        message = getString(R.string.nieve);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        if (getIdioma.equals("es")) {
            MediaPlayer.create(this, R.raw.nieve).start();

        } else if (getIdioma.equals("en")) {
            MediaPlayer.create(this, R.raw.nieve).start();

        }

    }

    private void chocolate() {

        message = getString(R.string.chocolate);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        if (getIdioma.equals("es")) {
            MediaPlayer.create(this, R.raw.chocolat).start();

        } else if (getIdioma.equals("en")) {
            MediaPlayer.create(this, R.raw.chocolat).start();

        }

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.palomas:
                palomitas();
                break;
            case R.id.hotdog:
                hotdog();
                break;
            case R.id.nachos:
                nachos();
                break;
            case R.id.dulces:
                dulces();
                break;
            case R.id.nieve:
                nieve();
                break;
            case R.id.chocolate:
                chocolate();
                break;

        }

    }
}




