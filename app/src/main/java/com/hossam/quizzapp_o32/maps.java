package com.hossam.quizzapp_o32;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;




public class maps extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    Button bNext;
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map = googleMap ;
        LatLng quizapp = new LatLng(33.5477145, -7.6898253);
        map.addMarker(new MarkerOptions().position(quizapp).title("quizapp"));
        map.moveCamera(CameraUpdateFactory.newLatLng(quizapp));

    }
}
