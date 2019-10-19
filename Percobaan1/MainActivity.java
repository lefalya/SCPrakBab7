package com.example.mapboxlbs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;

public class MainActivity extends AppCompatActivity {
    private MapView mapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Mapbox.getInstance(getApplicationContext(), .........(1) );

        setContentView(R.layout. .........(2) );
        mapView = (MapView) findViewById( .........(3) );
        mapView.onCreate(savedInstanceState);

        mapView.getMapAsync(new OnMapReadyCallback {
            @Override
            public void onMapReady(@NonNull MapboxMap mapboxMap) {

                mapboxMap.setStyle( .........(4) , new Style. .........(5) {
                    @Override
                    public void onStyleLoaded(@NonNull Style style) {
                        // Map is set up and the style has loaded. Now you can add data or make other map adjustments

                    }
                });

                mapboxMap. ........(6) (new MarkerOptions()
                        .position(new .........( (7) )
                        .title( .........(8) );
            }
        });
    }
}
