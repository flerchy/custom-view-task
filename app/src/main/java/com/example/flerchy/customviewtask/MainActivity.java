package com.example.flerchy.customviewtask;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView mv = new MyView(this);
        mv.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent ev) {
                if (ev.getAction() == MotionEvent.ACTION_DOWN) {
                    Integer x = (int) ev.getX();
                    Log.d("X", x.toString());
                    Integer y = (int) ev.getY();
                    Log.d("Y", y.toString());
                    if ((x - 550) * (x - 550) + (y - 600) * (y - 600) <= 250000)
                        v.invalidate();
                    Log.d("clicked","invalidated");
                }
                return true;
            }
        });
        setContentView(mv);

    }
}


