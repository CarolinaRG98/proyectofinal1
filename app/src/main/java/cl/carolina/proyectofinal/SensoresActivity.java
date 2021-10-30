package cl.carolina.proyectofinal;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationProvider;
import android.os.Bundle;
import android.util.Log;

//****//
public class SensoresActivity implements LocationListener {
    private final SensorMainActivity sensorMainActivity;


    public SensoresActivity(SensorMainActivity sensorMainActivity) {
        this.sensorMainActivity = sensorMainActivity;
    }

    public SensorMainActivity getMainActivity() {
        return sensorMainActivity;
    }


    @Override
    public void onLocationChanged(Location loc) {
        loc.getLatitude();
        loc.getLongitude();
        sensorMainActivity.TvLatitud.setText(String.valueOf(loc.getLatitude()));
        sensorMainActivity.TvLongitud.setText(String.valueOf(loc.getLongitude()));
        this.sensorMainActivity.setLocation(loc);

    }

    @Override
    public void onProviderDisabled(String provider) {
        sensorMainActivity.TvLatitud.setText("GPS Desactivado");
    }

    @Override
    public void onProviderEnabled(String provider) {
        sensorMainActivity.TvLatitud.setText("GPS Activo");
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        switch (status) {
            case LocationProvider.AVAILABLE:
                Log.d("debug", "LocationProvider.AVAILABLE");
                break;
            case LocationProvider.OUT_OF_SERVICE:
                Log.d("debug", "LocationProvider.OUT_OF_SERVICE");
                break;
            case LocationProvider.TEMPORARILY_UNAVAILABLE:
                Log.d("debug", "LocationProvider.TEMPORARILY_UNAVAILABLE");
                break;
        }
    }
}
