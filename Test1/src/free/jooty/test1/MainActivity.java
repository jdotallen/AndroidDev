package free.jooty.test1;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        
        b1.setOnClickListener(new Button.OnClickListener() {
        	
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Toast toast = Toast.makeText(MainActivity.this, "Aloha!", Toast.LENGTH_SHORT);
        		toast.show();
        		
        		Random random = new Random();
        		
        		switch (random.nextInt(3)) {
				case 0:
					v.setBackgroundColor(Color.RED);
					break;
				case 1:
					v.setBackgroundColor(Color.YELLOW);
					break;
				case 2:
					v.setBackgroundColor(Color.BLUE);
					break;

				default:
					v.setBackgroundColor(Color.WHITE);
					break;
				}
        	}
        });

        
        b2.setOnClickListener(new Button.OnClickListener() {
        	
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Toast toast = Toast.makeText(MainActivity.this, "Hello!", Toast.LENGTH_SHORT);
        		toast.show();
        		
        		Random random = new Random();
        		
        		switch (random.nextInt(3)) {
				case 0:
					v.setBackgroundColor(Color.RED);
					break;
				case 1:
					v.setBackgroundColor(Color.YELLOW);
					break;
				case 2:
					v.setBackgroundColor(Color.BLUE);
					break;

				default:
					v.setBackgroundColor(Color.WHITE);
					break;
				}
        	}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}

