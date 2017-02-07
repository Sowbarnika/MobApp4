package com.example.graphics;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
   Button b1,b2;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      new ProgressDialog(this);

      b1=(Button)findViewById(R.id.button1);
      b2=(Button)findViewById(R.id.button2);
      b1.setOnClickListener(new View.OnClickListener() {
         
         @Override
         public void onClick(View v) {
            TextView txtView = (TextView) findViewById(R.id.textView1);
            txtView.toString();
         }
      });

      b2.setOnClickListener(new View.OnClickListener() {
         
         @Override
         public void onClick(View v) {
            TextView txtView = (TextView) findViewById(R.id.textView1);
            txtView.setTextSize(55);
         }
      });
   }
}