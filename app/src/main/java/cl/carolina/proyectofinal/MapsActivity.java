package cl.carolina.proyectofinal;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.carolina.proyectofinal.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Lugares = new LatLng(-36.606691, -72.101901);
        LatLng Lugares2 = new LatLng(-36.605769,-72.107373);
        LatLng Lugares3 = new LatLng(-36.618003,-72.107486);
        LatLng Lugares4 = new LatLng(-36.609250,-72.100712);
        LatLng Lugares5 = new LatLng(-36.624450,-72.084975);
        LatLng Lugares6 = new LatLng(-36.610401,-72.101163);
        LatLng Lugares7 = new LatLng(-36.621799,-72.131142);
        mMap.addMarker(new MarkerOptions().position(Lugares).title("Catedral de Chillan"));
        mMap.addMarker(new MarkerOptions().position(Lugares2).title("Museo Claudio Arrau"));
        mMap.addMarker(new MarkerOptions().position(Lugares3).title("Estadio Nelson Oyarzun"));
        mMap.addMarker(new MarkerOptions().position(Lugares4).title("Mall Arauco"));
        mMap.addMarker(new MarkerOptions().position(Lugares5).title("Persa San Rafael"));
        mMap.addMarker(new MarkerOptions().position(Lugares6).title("Mercado de Chillan"));
        mMap.addMarker(new MarkerOptions().position(Lugares7).title("Parque momumental Bernardo O'higgins"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lugares));
        mMap.setMinZoomPreference(10);
        mMap.setMaxZoomPreference(20);
    }
}