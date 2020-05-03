package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

public class ImagenDinamica extends AppCompatActivity {

    private ImageView upimageView,downimageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_dinamica);

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        int action = event.getAction();
        int keyCode = event.getKeyCode();

        switch (keyCode){
            case KeyEvent.KEYCODE_VOLUME_UP:
                         if(action == KeyEvent.ACTION_UP){
                             upimageView.setImageResource(R.drawable.mutednoise);
                         }
                break;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                        if(action == KeyEvent.ACTION_DOWN){
                            downimageView.setImageResource(R.drawable.soudntransparent);
                        }
                break;
        }
        return super.dispatchKeyEvent(event);
    }
}
