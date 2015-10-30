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
		//view����ʼ����
		xPos = 150;
		yPos = 150;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint paint = new Paint();//����һ������
		//���һ��bitmap
		Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),
				R.drawable.s_jump);
		//����bitmap
		canvas.drawBitmap(bitmap, xPos, yPos, paint);
		//���bitmapû�б����յĻ�����ǿ�н��л���
		if (!bitmap.isRecycled()) {
			bitmap.recycle();
		}
	}
	//�����¼�����
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		//�������x��y����
		float x = event.getX() - 150;
		float y = event.getY() - 150;
		xPos = x;
		yPos = y;
		//���»��Ƹ�view
		invalidate();
		return true;
	}
}
