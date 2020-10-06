package com.lorenagallas.generadordecontactos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

public class VisualizarDatos extends AppCompatActivity {

    private EditText etNombre;
    private CalendarView cvNacimiento;
    private EditText etTelefono;
    private EditText etEmail;
    private EditText etDescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_datos);

        Bundle parametros   = getIntent().getExtras();

        String nombre       = parametros.getString(getResources().getString(R.string.pnombre));
        Long nacimiento     = parametros.getLong(getResources().getString(R.string.pnacimiento));
        String telefono     = parametros.getString(getResources().getString(R.string.ptelefono));
        String email        = parametros.getString(getResources().getString(R.string.pemail));
        String descripcion  = parametros.getString(getResources().getString(R.string.descripcion));

        etNombre   = (EditText) findViewById(R.id.etNombre);
        cvNacimiento = (CalendarView) findViewById(R.id.cvNacimiento) ;
        etTelefono = (EditText) findViewById(R.id.etTelefono);
        etEmail    = (EditText) findViewById(R.id.etEmail);
        etDescripcion = (EditText) findViewById(R.id.etDescripcion);

        etNombre.setText(nombre);
        cvNacimiento.setDate(nacimiento);
        etTelefono.setText(telefono);
        etEmail.setText(email);
        etDescripcion.setText(descripcion);
    }

    public void siguiente(View v){

    }


}


