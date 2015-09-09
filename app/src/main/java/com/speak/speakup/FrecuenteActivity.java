package com.speak.speakup;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class FrecuenteActivity extends Activity implements OnClickListener {
	
	private ImageButton casa;
	private ImageButton escuela;
	private ImageButton otros;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_frecuente);
		
		casa = (ImageButton) findViewById(R.id.fimageButton1);
		escuela = (ImageButton) findViewById(R.id.fimageButton2);
		otros = (ImageButton) findViewById(R.id.fimageButton3);
		casa.setOnClickListener(this);
		escuela.setOnClickListener(this);
		otros.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.frecuente, menu);
		return true;
	}
	
	public void Casa(){
		Intent intent = new Intent(FrecuenteActivity.this, CasaFrec.class);
		startActivity(intent);
		
	}
	
	public void Escuela(){
		Intent intent = new Intent(FrecuenteActivity.this, EscuelaFrec.class);
		startActivity(intent);
		
		
	}
	
	public void Otros(){
		Intent intent = new Intent(FrecuenteActivity.this,Otrasfrec.class);
		startActivity(intent);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		
		case R.id.fimageButton1:
			Casa();
		break;
		
		case R.id.fimageButton2:
			Escuela();
			break;
		case R.id.fimageButton3:
			Otros();
			break;
		}
		
	}

}
