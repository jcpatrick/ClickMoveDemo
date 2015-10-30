package com.example.framelayoudemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class MyView extends View {
	public float xPos;
	public float yPos;

	public MyView(Context context) {
		super(context);
		//view的起始坐标
		xPos = 150;
		yPos = 150;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint paint = new Paint();//创建一个画笔
		//获得一张bitmap
		Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),
				R.drawable.s_jump);
		//绘制bitmap
		canvas.drawBitmap(bitmap, xPos, yPos, paint);
		//如果bitmap没有被回收的话，就强行进行回收
		if (!bitmap.isRecycled()) {
			bitmap.recycle();
		}
	}
	//触摸事件监听
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		//触摸后的x、y坐标
		float x = event.getX() - 150;
		float y = event.getY() - 150;
		xPos = x;
		yPos = y;
		//重新绘制该view
		invalidate();
		return true;
	}
}
