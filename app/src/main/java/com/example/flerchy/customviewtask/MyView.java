package com.example.flerchy.customviewtask;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class MyView extends View {

    private Paint paint = new Paint();

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);
        paint.setColor(generateRandomColor());
        canvas.drawCircle(550, 600, 500, paint);
    }



    private int generateRandomColor() {
        Random random = new Random();
        return Color.rgb(random.nextInt(255),random.nextInt(255),random.nextInt(255));
    }
}
