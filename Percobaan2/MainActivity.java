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

        if (PermissionsManager. ............(14) (this)) {

            locationComponent = mapboxMap. ............(15) ();
            locationComponent.activateLocationComponent(this,  ............(16) );
            locationComponent.setLocationComponentEnabled(true);

            locationComponent.setCameraMode( ............(17) );
        } else {
            permissionsManager = new ............(18) (this);
            permissionsManager. ............(19) (this);
        }
        
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        permissionsManager.onRequestPermissionsResult (............(20) , ............(21), ............(22));
    }

    @Override
    public void onExplanationNeeded(List<String> permissionsToExplain) {
        Toast.makeText(this, R.string.user_location_permission_explanation,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPermissionResult(boolean granted) {
        if ( ............(23) ) {
            enableLocationComponent(mapboxMap.getStyle());
        } else {
            Toast.makeText(this, R.string. ............(24) , Toast.LENGTH_LONG).show();
            finish();
        }
    }
}
