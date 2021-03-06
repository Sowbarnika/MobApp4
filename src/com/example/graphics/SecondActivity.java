package com.example.graphics;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
 
public class SecondActivity extends Activity {
 
	DemoView demo;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		demo = new DemoView(this);
		setContentView(demo);
	}
 
	private class DemoView extends View {
		public DemoView(Context mcontext) {
			super(mcontext);
		}
 
		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
 
			// custom drawing code here
			Paint paint = new Paint();
			paint.setStyle(Paint.Style.FILL);
 
			// make the entire canvas white
			paint.setColor(Color.CYAN);
			canvas.drawPaint(paint);
 
			// draw blue circle with anti aliasing turned off
			paint.setAntiAlias(false);
			paint.setColor(Color.MAGENTA);
			canvas.drawCircle(20, 20, 15, paint);
 
			// draw green circle with anti aliasing turned on
			paint.setAntiAlias(true);
			paint.setColor(Color.GRAY);
			canvas.drawCircle(60, 20, 15, paint);
 
			// draw red rectangle with anti aliasing turned off
			paint.setAntiAlias(false);
			paint.setColor(Color.RED);
			canvas.drawRect(100, 5, 200, 30, paint);
 
			// draw the rotated text
			canvas.rotate(-40);
 
			paint.setStyle(Paint.Style.FILL);
			canvas.drawText("Graphics Rotation", 45, 185, paint);
 
			// undo the rotate
			canvas.restore();
		}
	}
 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
 
}