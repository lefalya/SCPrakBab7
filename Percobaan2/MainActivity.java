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

(1)

import java.util.List;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, PermissionsListener {
    
    (2)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        (3)
    }

    @Override
    public void onMapReady(@NonNull final MapboxMap mapboxMap) {
        (4)
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
