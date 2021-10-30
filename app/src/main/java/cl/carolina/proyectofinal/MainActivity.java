package cl.carolina.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
        //Metodo para programar boton Mapa//
    public void ButtonMapa (View view){
        Intent buttonmapa = new Intent(this, MapsActivity.class);
        startActivity(buttonmapa);
    }
       //Metodo para programar boton Historia de la ciudad//
       public void ButtonHistoria (View view){
           Intent buttonhistoria = new Intent(this, HistoriaCiudadActivity.class);
           startActivity(buttonhistoria);
       }
    //Metodo para programar boton Puntos de interes//
    public void ButtonPuntos (View view){
        Intent buttonpuntos = new Intent(this, PuntosInteresActivity.class);
        startActivity(buttonpuntos);
    }
    //Metodo para programar boton Galeria//
    public void ButtonGaleria (View view){
        Intent buttongaleria = new Intent(this, GaleriaActivity.class);
        startActivity(buttongaleria);
    }
    //Metodo para programar boton Sensores y SOS//
    public void ButtonSensores (View view){
        Intent buttonsensores = new Intent(this, SensorMainActivity.class);
        startActivity(buttonsensores);
    }
}