package cl.carolina.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class PuntosInteresActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntos_interes);
    }
    //Metodo para programar boton Volver a inicio//
    public void ButtonVolver2 (View view){
        Intent buttonvolver2 = new Intent(this, MainActivity.class);
        startActivity(buttonvolver2);
    }


    }
