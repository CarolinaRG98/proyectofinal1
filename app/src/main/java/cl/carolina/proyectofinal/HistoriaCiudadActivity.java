package cl.carolina.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HistoriaCiudadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_ciudad);
    }
    //Metodo para programar boton Volver a inicio//
    public void ButtonVolver (View view){
        Intent buttonvolver = new Intent(this, MainActivity.class);
        startActivity(buttonvolver);
    }
}