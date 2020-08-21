package com.example.app_taex_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity_maps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_maps);

        MapFragment mapFragment = new MapFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.activityyyyyy, mapFragment).commit();
    }

    public void onclick_sms_ubicacion(View view)
    {
        Toast.makeText(getApplicationContext(),  "Talleres Artisticos",
                Toast.LENGTH_LONG).show();
    }
}
