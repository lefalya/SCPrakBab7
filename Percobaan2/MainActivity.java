package com.example.mapboxlbspart1_5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.mapbox.android.core.permissions.PermissionsListener;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.Style;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

import com.mapbox.android.core.permissions. ............(1) ;
import com.mapbox.android.core.permissions. ............(2) ;
import com.mapbox.mapboxsdk.location. ............(3) ;
import com.mapbox.mapboxsdk.location.modes. ............(4) ;

import java.util.List;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, PermissionsListener {
        
    private MapView ............(5) ;
    private MapboxMap ............(6) ;

    private PermissionsManager ............(7) ;
    private LocationComponent ............(8) ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(this, getString( ............(9) ));
        setContentView(R.layout.activity_main);
        mapView = findViewById( ............(10) );
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull final MapboxMap mapboxMap) {
        this.mapboxMap = ............(11) ;
        mapboxMap.setStyle(getString(R.string. ............(12) ), 
        new Style.OnStyleLoaded() {
            @Override
            public void onStyleLoaded(@NonNull Style style) {
                ............(13)(style);
            }
        });
    }

    @SuppressWarnings( {"MissingPermission"})
    private void enableLocationComponent(@NonNull Style loadedMapStyle) {
        (5)
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        (6)
    }

    @Override
    public void onExplanationNeeded(List<String> permissionsToExplain) {
        (7)
    }

    @Override
    public void onPermissionResult(boolean granted) {
        (8)
    }
}
