package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class keycaps extends AppCompatActivity {


    private TextView textView;
    private ImageView rightKey,leftKey,downKey,upKey;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keycaps);

        upKey = findViewById(R.id.imageView4);
        downKey = findViewById(R.id.imageView3);
        leftKey = findViewById(R.id.imageView1);
        rightKey = findViewById(R.id.imageView2);
        textView = findViewById(R.id.textView);

        upKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    upKey.setImageResource(R.drawable.blackbutton);
                    textView.setText("Arriba");
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    textView.setText("");
                    upKey.setImageResource(R.drawable.buttonRed);
                }
                return true;
            }
        });

        downKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    downKey.setImageResource(R.drawable.blackbutton);
                    textView.setText("Abajo");
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    textView.setText("");
                    downKey.setImageResource(R.drawable.buttonRed);
                }
                return true;
            }
        });

        leftKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    leftKey.setImageResource(R.drawable.blackbutton);
                    textView.setText("Izquierda");
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    textView.setText("");
                    leftKey.setImageResource(R.drawable.buttonRed);
                }
                return true;
            }
        });

        rightKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    rightKey.setImageResource(R.drawable.blackbutton);
                    textView.setText("Derecha");
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    textView.setText("");
                    rightKey.setImageResource(R.drawable.buttonRed);
                }
                return true;
            }
        });
    }
}
