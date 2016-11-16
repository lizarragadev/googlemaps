package com.cognos.mapas;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

public class PrimerMapaActivity extends AppCompatActivity
implements OnMapReadyCallback {

    private MapaFragment mapaFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_mapa);

        mapaFragment = MapaFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.map, mapaFragment)
                .commit();

        mapaFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
