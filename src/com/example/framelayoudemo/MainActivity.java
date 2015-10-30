package com.example.framelayoudemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;

public class MainActivity extends Activity {
	FrameLayout fm;
	MyView mv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fm = (FrameLayout) findViewById(R.id.FrameLayout1);
		mv = new MyView(this);
		fm.addView(mv);
		/*第一种情况
		 * mv.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				float x = event.getX() - 150;
				float y = event.getY() - 150;
				mv.xPos = x;
				mv.yPos = y;
				mv.invalidate();
				return true;
			}
		});
		fm.addView(mv);*/
		
		/**
		 * 第二种情况
		 */
		
//		fm.setOnTouchListener(new OnTouchListener() {
//			
//			@Override
//			public boolean onTouch(View v, MotionEvent event) {
//				float x = event.getX() - 150;
//				float y = event.getY() - 150;
//				mv.xPos = x;
//				mv.yPos = y;
//				mv.invalidate();
//				return true;
//			}
//		});
		
	}
}
