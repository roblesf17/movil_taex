package com.example.app_taex_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity_maps_desarrollo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_maps_desarrollo);

        MapFragmentDesarrollo mapFragment = new MapFragmentDesarrollo();
        getSupportFragmentManager().beginTransaction().add(R.id.activityyyyyy3, mapFragment).commit();


    }

    public void onclick_sms_ubicacion3(View view) {
        Toast.makeText(getApplicationContext(), "Talleres de Desarrollo Personal",
                Toast.LENGTH_LONG).show();
    }
}