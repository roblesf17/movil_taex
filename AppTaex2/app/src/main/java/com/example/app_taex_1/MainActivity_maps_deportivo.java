package com.example.app_taex_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity_maps_deportivo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_maps_deportivo);

        MapFragmentDeportivo mapFragment = new MapFragmentDeportivo();
        getSupportFragmentManager().beginTransaction().add(R.id.activityyyyyy2, mapFragment).commit();
    }

    public void onclick_sms_ubicacion2(View view)
    {
        Toast.makeText(getApplicationContext(),  "Talleres Deportivos",
                Toast.LENGTH_LONG).show();
    }
}
