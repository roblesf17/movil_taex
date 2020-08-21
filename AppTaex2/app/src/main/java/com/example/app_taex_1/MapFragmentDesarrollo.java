package com.example.app_taex_1;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragmentDesarrollo extends Fragment implements OnMapReadyCallback, LocationListener {

    GoogleMap gMap;
    LocationManager lm;
    Location location;


    int tipo_mapa = 0 ;



    double longitude = 0;
    double latitude = 0;


    public static String Ciudad = "" ;


    public static double latitud_a = 0;
    public static double longitud_a =0;

    public static String direccion_temporal = "";

    public MapFragmentDesarrollo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_map_desarrollo, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) this.getChildFragmentManager().findFragmentById(R.id.map3);


        mapFragment.getMapAsync( (OnMapReadyCallback) this );

        Spinner spinner = (Spinner) v.findViewById(R.id.spinner3);
        String[] letra = {" 1) ORATORIA"," 2) LOCUCIÓN RADIAL Y MAESTRO CEREMONIAS"," 3) PANADERÍA Y PASTELERÍA"," 4) INYECTABLES Y CURACIONES"," 5) ¿QUÉ TENGO QUE HACER PARA SER FELIZ?"," 6) SEXUALIDAD HUMANA"," 7) MI FUTURO HIJOS SANOS"," 8) HABILIDADES BLANDAS"," 9) REDACCIÓN"," 9) GESTIÓN PRODUCTIVA DE REDES SOCIALES"};


        ArrayAdapter adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_spinner_dropdown_item, letra);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item;
                item = (String) parent.getItemAtPosition(position);
                if(item.equals(" 1) ORATORIA")){
                    latitude = -18.005027;
                    longitude = -70.225951;

                    //direccion_temporal = "Dirección Oratoria";

                    tipo_mapa = 1 ;
                    //tipo_mapa = 3 ;
                    Ciudad = "Aula C-301 EX FAING" ;
                    direccion_temporal = Ciudad;
                    onMapReady(gMap);

                    //Toast.makeText(getContext(),  "Av. Aviación 985 . 2do Piso , frente al Restaurant Cuzco , Cerca al hospital de la Solidaridad",
                    //Toast.LENGTH_LONG).show();
                }
                if(item.equals(" 2) LOCUCIÓN RADIAL Y MAESTRO CEREMONIAS")){
                    latitude = -18.005027;
                    longitude = -70.225951;
                    tipo_mapa = 1 ;
                    //tipo_mapa = 3 ;
                    Ciudad = "Aula C-303 Ex FAING" ;
                    direccion_temporal = Ciudad;
                    onMapReady(gMap);
                }
                if(item.equals(" 3) PANADERÍA Y PASTELERÍA")){
                    latitude = -18.004321;
                    longitude = -70.225836;
                    tipo_mapa = 1 ;
                    //tipo_mapa = 3 ;
                    Ciudad = "Panificadora UPT" ;
                    direccion_temporal = Ciudad;
                    onMapReady(gMap);
                }
                if(item.equals(" 4) INYECTABLES Y CURACIONES")){
                    latitude = -18.005089;
                    longitude = -70.226145;
                    tipo_mapa = 1 ;
                    //tipo_mapa = 3 ;
                    Ciudad = "Sala 6 Laboratorio de Cómputo 1 Ex FAU" ;
                    direccion_temporal = Ciudad;
                    onMapReady(gMap);
                }
                if(item.equals(" 5) ¿QUÉ TENGO QUE HACER PARA SER FELIZ?")){
                    latitude = -18.005027;
                    longitude = -70.225951;
                    tipo_mapa = 1 ;
                    //tipo_mapa = 3 ;
                    Ciudad = "Aula C-301 Ex FAING" ;
                    direccion_temporal = Ciudad;
                    onMapReady(gMap);
                }
                if(item.equals(" 6) SEXUALIDAD HUMANA")){
                    latitude = -18.005027;
                    longitude = -70.225951;
                    tipo_mapa = 1 ;
                    //tipo_mapa = 3 ;
                    Ciudad = "Aula C-301 Ex FAING" ;
                    direccion_temporal = Ciudad;
                    onMapReady(gMap);
                }
                if(item.equals(" 7) MI FUTURO HIJOS SANOS")){
                    latitude = -18.005027;
                    longitude = -70.225951;
                    tipo_mapa = 1 ;
                    //tipo_mapa = 3 ;
                    Ciudad = "Aula C-301 Ex FAING" ;
                    onMapReady(gMap);
                }
                if(item.equals(" 8) HABILIDADES BLANDAS")){
                    latitude = -18.005027;
                    longitude = -70.225951;
                    tipo_mapa = 1 ;
                    //tipo_mapa = 3 ;
                    Ciudad = "Aula C-303 Ex FAING" ;
                    direccion_temporal = Ciudad;
                    onMapReady(gMap);
                }
                if(item.equals(" 9) REDACCIÓN")){
                    latitude = -18.004100;
                    longitude =  -70.224554;
                    tipo_mapa = 1 ;
                    //tipo_mapa = 3 ;
                    Ciudad = "Laboratorio FACEM 4to Piso" ;
                    direccion_temporal = Ciudad;
                    onMapReady(gMap);
                }
                if(item.equals(" 9) GESTIÓN PRODUCTIVA DE REDES SOCIALES")){
                    latitude = -18.005027;
                    longitude = -70.225951;
                    tipo_mapa = 1 ;
                    //tipo_mapa = 3 ;
                    Ciudad = "Aula C-302 Ex FAING" ;
                    direccion_temporal = Ciudad;
                    onMapReady(gMap);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return v;
    }

    @Override
    public void onLocationChanged(Location location) {
        if (location != null) {
            Log.v("Location Changed", latitude + " and " + longitude);
            lm.removeUpdates(this);
        }
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;

        gMap.setMapType(mMapTypes[tipo_mapa]);

        lm = (LocationManager) getContext().getSystemService( Context.LOCATION_SERVICE);

        if (getActivity().checkSelfPermission( Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && getActivity().checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
        }
    /*lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0,  this);
    location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);

    longitude = location.getLongitude();
    latitude = location.getLatitude();*/

        LatLng aqui = new LatLng(latitude, longitude);

        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(aqui)
                .zoom(17)//zoom
                .bearing(30)//inclinacion
                .build();

        gMap.addMarker(new MarkerOptions().position(aqui).title(direccion_temporal));
        gMap.animateCamera( CameraUpdateFactory.newCameraPosition(cameraPosition));

        Toast.makeText(getContext(),  Ciudad,
                Toast.LENGTH_SHORT).show();

        try {

            Location location = new Location("localizacion 1");
            location.setLatitude(latitude);  //latitud
            location.setLongitude(longitude); //longitud
            Location location2 = new Location("localizacion 2");
            location2.setLatitude(latitud_a);  //latitud
            location2.setLongitude(longitud_a); //longitud
            double distance = location.distanceTo(location2);

            /*
            Toast.makeText(getContext(),"Existe una distancia de :  " + Double.toString(distance) + " de distancia ",
                    Toast.LENGTH_SHORT).show();
*/
        }
        catch(Exception e) {
            //  Block of code to handle errors
        }
    }


    private int mMapTypes[] = {
            GoogleMap.MAP_TYPE_NONE,
            GoogleMap.MAP_TYPE_NORMAL,
            GoogleMap.MAP_TYPE_SATELLITE,
            GoogleMap.MAP_TYPE_HYBRID,
            GoogleMap.MAP_TYPE_TERRAIN
    };


}
