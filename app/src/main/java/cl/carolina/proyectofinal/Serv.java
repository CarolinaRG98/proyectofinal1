package cl.carolina.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import cl.carolina.proyectofinal.modelo.Servicios;

public class Serv extends AppCompatActivity {
    private List<Servicios> ListServicios=new ArrayList<Servicios>();
    ArrayAdapter<Servicios> arrayAdapterServicios;
    EditText editTextServicio, editTextDireccion;
    Button buttonAceptar;
    ListView ListViewServicios;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serv);

        editTextServicio=findViewById(R.id.editTextServicio);
        editTextDireccion=findViewById(R.id.editTextDireccion);
        buttonAceptar=findViewById(R.id.buttonAceptar);
        ListViewServicios=findViewById(R.id.ListViewServicios);

        inicializarFirebase();
        ListarDatos();

        buttonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Servicios servicios = new Servicios();

                servicios.setIdservicio(UUID.randomUUID().toString());
                servicios.setNombreservicio(editTextServicio.getText().toString());
                servicios.setDireccion(editTextDireccion.getText().toString());

                databaseReference.child("Servicios").child(servicios.getIdservicio()).setValue(servicios);
            }
        });
    }

    private void ListarDatos() {
    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference();
    }
}