package com.example.ejemplo20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void mensajeNormal(View view){
        Toast mensaje = Toast.makeText(getApplicationContext(),"Mensaje Toast normal", Toast.LENGTH_SHORT);
        mensaje.show();

    }

    public void mensajePosicion(View view) {

        Toast mensaje = Toast.makeText(getApplicationContext(), "Toast con posición gravity", Toast.LENGTH_SHORT);
        mensaje.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT,0,0);
        mensaje.show();


    }

    public void mensajePersonalizado(View arg0) {

        Toast mensaje = new Toast(getApplicationContext());
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.capa_toast, (ViewGroup) findViewById(R.id.lytLayout));

        TextView txtMsg = (TextView)layout.findViewById(R.id.txtMensaje);

        txtMsg.setText("Toast Personalizado Icono");

        mensaje.setDuration(Toast.LENGTH_SHORT);
        mensaje.setView(layout);
        mensaje.show();

    }
}