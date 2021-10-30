package cl.carolina.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GaleriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
    }
    //Metodo para programar boton Volver a inicio//
    public void ButtonVolver3 (View view){
        Intent buttonvolver3 = new Intent(this, MainActivity.class);
        startActivity(buttonvolver3);
    }
}