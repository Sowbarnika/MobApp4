package com.example.graphics;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button b1,b2,b3;
	EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        e1=(EditText)findViewById(R.id.editText1);
    	e2=(EditText)findViewById(R.id.editText2);
    	e3=(EditText)findViewById(R.id.editText3);
    	
        b1.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
            	
            }
         });

    }
    
    protected void onDraw(Canvas canvas) {
    	Paint paint = new Paint();
    	
    }
}