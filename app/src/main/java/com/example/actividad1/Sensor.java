package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;



public class Sensor extends AppCompatActivity implements SensorEventListener {


    SensorManager sensorManager;
    android.hardware.Sensor accelometer;
    TextView xValue,yValue,zValue;
    ConstraintLayout constraintLayout;
    private static final String TAG = "Sensor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);

        xValue = (TextView) findViewById(R.id.xValueText);
        yValue = (TextView) findViewById(R.id.yValueText);
        zValue = (TextView) findViewById(R.id.zValueText);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accelometer = sensorManager.getDefaultSensor(android.hardware.Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(Sensor.this,accelometer,SensorManager.SENSOR_DELAY_NORMAL);


    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        //Log.d(TAG, "onSensorChanged: X" + event.values[0]+ "Y: "+ event.values[1]+ "Z: "+ event.values[2]);

        xValue.setText(String.valueOf(event.values[0]));
        yValue.setText(String.valueOf(event.values[1]));
        zValue.setText(String.valueOf(event.values[2]));
        constraintLayout.setBackgroundColor(Color.rgb((int)event.values[2],(int)event.values[0],(int)event.values[1]));
    }

    @Override
    public void onAccuracyChanged(android.hardware.Sensor sensor, int accuracy) {

    }
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(Sensor.this,accelometer, SensorManager.SENSOR_DELAY_NORMAL);
    }


}
