package org.example.sudokuv1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class Sudokuv1 extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudokuv1);
    }
	@Override
    public void onClick(View v) {
    	switch (v.getId()) {
    	case R.id.about_button:
    	Intent i = new Intent(this, About.class);
    	startActivity(i);
    	break;
    	
    	// More buttons go here (if any) ...
    	}
    	}
    	

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sudokuv1, menu);
        return true;
    }
	
    
}
