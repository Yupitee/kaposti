package lv.tjn.desas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	int tagad = R.drawable.kaposts;
	int roza = R.drawable.roza;
	String kaposts = "Kâposta kârta.";
	String burkans = "Burkâna kârta.";
	String kuzvara = "Kâposta uzvara";
	String buzvara = "Burkâna uzvara";
	int[][] rez = new int [3][3];
	//int[][] pogas = new int [3][3];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		for(int k=0; k<3; k++){
			for(int r=0; r<3; r++){
				rez[k][r] = 0;
			}
		}

	}
	public void onClick(View view) {
		switch (view.getId()){ 
		  case R.id.a0 :
			  rez[0][0] = tagad;
		  break;
		  
		  case R.id.a1 :
			  rez[0][1] = tagad;
		  break;
		  
		  case R.id.a2 :
			  rez[0][2] = tagad;
		  break;
		  
		  case R.id.b0 :
			  rez[1][0] = tagad;
		  break;
		  
		  case R.id.b1 :
			  rez[1][1] = tagad;
		  break;
		  
		  case R.id.b2 :
			  rez[1][2] = tagad;
		  break;
		  
		  case R.id.c0 :
			  rez[2][0] = tagad;
		  break;
		  
		  case R.id.c1 :
			  rez[2][1] = tagad;
		  break;
		  
		  case R.id.c2 :
			  rez[2][2] = tagad;
		  break;
		}
		ImageButton button = (ImageButton) view;
		TextView s = (TextView)findViewById(R.id.karta);
		button.setImageResource(tagad);
		if(tagad == R.drawable.kaposts){
			tagad = R.drawable.burkans;
			button.setClickable(false);
			s.setText(burkans);
		}else {
			tagad = R.drawable.kaposts; 	
			button.setClickable(false);
			s.setText(kaposts);
		}
		
		ImageButton a0 = (ImageButton) findViewById(R.id.a0);
		ImageButton a1 = (ImageButton) findViewById(R.id.a1);
		ImageButton a2 = (ImageButton) findViewById(R.id.a2);
		ImageButton b0 = (ImageButton) findViewById(R.id.b0);
		ImageButton b1 = (ImageButton) findViewById(R.id.b1);
		ImageButton b2 = (ImageButton) findViewById(R.id.b2);
		ImageButton c0 = (ImageButton) findViewById(R.id.c0);
		ImageButton c1 = (ImageButton) findViewById(R.id.c1);
		ImageButton c2 = (ImageButton) findViewById(R.id.c2);
		
		if(rez[0][0] == rez[0][1] && rez[0][1] == rez[0][2] && rez[0][0] != 0){
			if(rez[0][0] == R.drawable.kaposts){
				s.setText(kuzvara);
			}else{
				s.setText(buzvara);
			}
			a0.setClickable(false);
			a1.setClickable(false);
			a2.setClickable(false);
			b0.setClickable(false);
			b1.setClickable(false);
			b2.setClickable(false);
			c0.setClickable(false);
			c1.setClickable(false);
			c2.setClickable(false);
		}if(rez[1][0] == rez[0][1] && rez[1][1] == rez[1][2] && rez[1][0] != 0){
			if(rez[1][0] == R.drawable.kaposts){
				s.setText(kuzvara);
			}else{
				s.setText(buzvara);
			}
			a0.setClickable(false);
			a1.setClickable(false);
			a2.setClickable(false);
			b0.setClickable(false);
			b1.setClickable(false);
			b2.setClickable(false);
			c0.setClickable(false);
			c1.setClickable(false);
			c2.setClickable(false);
		}if(rez[2][0] == rez[2][1] && rez[2][1] == rez[2][2] && rez[2][0] != 0){
			if(rez[2][0] == R.drawable.kaposts){
				s.setText(kuzvara);
			}else{
				s.setText(buzvara);
			}
			a0.setClickable(false);
			a1.setClickable(false);
			a2.setClickable(false);
			b0.setClickable(false);
			b1.setClickable(false);
			b2.setClickable(false);
			c0.setClickable(false);
			c1.setClickable(false);
			c2.setClickable(false);
		}if(rez[0][0] == rez[1][0] && rez[1][0] == rez[2][0] && rez[0][0] != 0){
			if(rez[0][0] == R.drawable.kaposts){
				s.setText(kuzvara);
			}else{
				s.setText(buzvara);
			}
			a0.setClickable(false);
			a1.setClickable(false);
			a2.setClickable(false);
			b0.setClickable(false);
			b1.setClickable(false);
			b2.setClickable(false);
			c0.setClickable(false);
			c1.setClickable(false);
			c2.setClickable(false);
		}if(rez[0][1] == rez[1][1] && rez[1][1] == rez[2][1] && rez[0][1] != 0){
			if(rez[0][1] == R.drawable.kaposts){
				s.setText(kuzvara);
			}else{
				s.setText(buzvara);
			}
			a0.setClickable(false);
			a1.setClickable(false);
			a2.setClickable(false);
			b0.setClickable(false);
			b1.setClickable(false);
			b2.setClickable(false);
			c0.setClickable(false);
			c1.setClickable(false);
			c2.setClickable(false);
		}if(rez[0][2] == rez[1][2] && rez[1][2] == rez[2][2] && rez[0][2] != 0){
			if(rez[0][2] == R.drawable.kaposts){
				s.setText(kuzvara);
			}else{
				s.setText(buzvara);
			}
			a0.setClickable(false);
			a1.setClickable(false);
			a2.setClickable(false);
			b0.setClickable(false);
			b1.setClickable(false);
			b2.setClickable(false);
			c0.setClickable(false);
			c1.setClickable(false);
			c2.setClickable(false);
		}if(rez[0][0] == rez[1][1] && rez[1][1] == rez[2][2] && rez[0][0] != 0){
			if(rez[0][0] == R.drawable.kaposts){
				s.setText(kuzvara);
			}else{
				s.setText(buzvara);
			}
			a0.setClickable(false);
			a1.setClickable(false);
			a2.setClickable(false);
			b0.setClickable(false);
			b1.setClickable(false);
			b2.setClickable(false);
			c0.setClickable(false);
			c1.setClickable(false);
			c2.setClickable(false);
		}if(rez[0][2] == rez[1][1] && rez[1][1] == rez[2][0] && rez[0][2] != 0){
			if(rez[0][2] == R.drawable.kaposts){
				s.setText(kuzvara);
			}else{
				s.setText(buzvara);
			}
			a0.setClickable(false);
			a1.setClickable(false);
			a2.setClickable(false);
			b0.setClickable(false);
			b1.setClickable(false);
			b2.setClickable(false);
			c0.setClickable(false);
			c1.setClickable(false);
			c2.setClickable(false);
		}if(rez[1][0] == rez[1][1] && rez[1][1] == rez[1][2] &&rez[1][2] != 0){
			if(rez[1][0] == R.drawable.kaposts){
				s.setText(kuzvara);
			}else{
				s.setText(buzvara);
			}
			a0.setClickable(false);
			a1.setClickable(false);
			a2.setClickable(false);
			b0.setClickable(false);
			b1.setClickable(false);
			b2.setClickable(false);
			c0.setClickable(false);
			c1.setClickable(false);
			c2.setClickable(false);
		}
	}
	/*
	public void a0(View view){
		mas[1][1] = tagad;
		ImageButton button = (ImageButton) view;
		TextView s = (TextView)findViewById(R.id.karta);
		button.setImageResource(tagad);
		if(tagad == R.drawable.kaposts){
			tagad = R.drawable.burkans;
			button.setClickable(false);
			s.setText(burkans);
		}else {
			tagad = R.drawable.kaposts; 	
			button.setClickable(false);
			s.setText(kaposts);
		}
	}*/
	
	

	public void tirit(View view){
		ImageButton a0 = (ImageButton) findViewById(R.id.a0);
		ImageButton a1 = (ImageButton) findViewById(R.id.a1);
		ImageButton a2 = (ImageButton) findViewById(R.id.a2);
		ImageButton b0 = (ImageButton) findViewById(R.id.b0);
		ImageButton b1 = (ImageButton) findViewById(R.id.b1);
		ImageButton b2 = (ImageButton) findViewById(R.id.b2);
		ImageButton c0 = (ImageButton) findViewById(R.id.c0);
		ImageButton c1 = (ImageButton) findViewById(R.id.c1);
		ImageButton c2 = (ImageButton) findViewById(R.id.c2);
		a0.setClickable(true);
		a0.setImageResource(roza);
		
		a1.setClickable(true);
		a1.setImageResource(roza);
		
		a2.setClickable(true);
		a2.setImageResource(roza);
		
		b0.setClickable(true);
		b0.setImageResource(roza);
		
		b1.setClickable(true);
		b1.setImageResource(roza);
		
		b2.setClickable(true);
		b2.setImageResource(roza);

		c0.setClickable(true);
		c0.setImageResource(roza);

		c1.setClickable(true);
		c1.setImageResource(roza);
		
		c2.setClickable(true);
		c2.setImageResource(roza);
		for(int k=0; k<3; k++){
			for(int r=0; r<3; r++){
				rez[k][r] = 0;
			}
		}
	}
	
}


